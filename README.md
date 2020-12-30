# venta-soaint
1.- Para inicializar el proyecto se deberá ejecutar el script export.sql en una base de datos Oracle.
2.- Para enviar el ejecutable a un contenedor docker se deberá instalar la imagen openJdk en un entorno linux, posterior a ello se ejecutará los siguientes comandos:
	docker build -t "NOMBRE_IMAGEN" .
	docker run --name NOMBRE_REPOSITORIO -p 8080:8080 NOMBRE_IMAGEN:latest
	

Para mejorar el carrito de compras se tendría que pasar de la arquitectura monolítica hacia microservicios, como también mejorando las consultas mediante una base de datos en caché (Redis) que se alinea con los microservicios. En cuanto
a la seguridad se debería de enviar el password encodificado mediante Base64 a la base de datos.