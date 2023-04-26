# Ejer-Integrador

Implementacion de un datáfono sencillo con pago a plazos.

## Table of contents

  - Built with: #JS 
  - Author: #AIPONCEP

## Usage

```java

 Posnet posnet=new Posnet();
        Persona titular=new Persona("45340173C","Paco","Paquirri","928756478","pepitoPaquirri@gmail.com");
        TarjetaDeCredito tarjeta=new TarjetaDeCredito("Facebank","41547898745",15000,titular,EntidadBancaria.BIRZA);
        
        System.out.print("Tarjeta antes del pago: ");
        System.out.print(tarjeta+"\n");
                
        System.out.print("Ticket tras pago: ");
        Ticket ticketGenerado=posnet.efectuarPago(tarjeta, 10000, 5);
        System.out.print(ticketGenerado +"\n");
        
        System.out.print("Tarjeta depués del pago: ");
        System.out.print(tarjeta+"\n");   

```

## Links

- [URL] (https://github.com/AIPONCEP/Ejer_Integrador.git)

## Author

- Website - [AIPONCEP](https://github.com/AIPONCEP)
