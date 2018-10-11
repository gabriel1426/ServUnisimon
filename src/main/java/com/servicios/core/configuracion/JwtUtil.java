package com.servicios.core.configuracion;

import java.util.Collections;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtUtil {
	
	
	// Método para crear el JWT y enviarlo al cliente en el header de la respuesta
    public static String addAuthentication(HttpServletResponse res, String username) {

        String token = Jwts.builder()
            .setSubject(username)
            // Vamos a asignar un tiempo de expiracion de 1 minuto
            // solo con fines demostrativos en el video que hay al final
            .setExpiration(new Date(System.currentTimeMillis() + 6000000))
            // Hash con el que firmaremos la clave
            .signWith(SignatureAlgorithm.HS512, "P@tit0")
            .compact();
        return token;
    }

    
    
    // Método para validar el token enviado por el cliente
    public static String getAuthentication(HttpServletRequest request) {
        
        // Obtenemos el token que viene en el encabezado de la peticion
        String token = request.getHeader("Authorization");
        
        // si hay un token presente, entonces lo validamos
        if (token != null) {
            String user = Jwts.parser()
                    .setSigningKey("P@tit0")
                    .parseClaimsJws(token.replace("Bearer", "")) //este metodo es el que valida
                    .getBody()
                    .getSubject();

				return  user;
        }
        return null;
    }

}
