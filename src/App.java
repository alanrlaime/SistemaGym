
import Interfaz.CentroControl;
import Interfaz.Principal;
import Proyecto.*;
import Proyecto.MultiColaS;



public class App {
    public static void main(String[] args) {
        //PRIMER GIMNASIO
        Reserva res1=new Reserva("Ana",11,4235,"11/11/2024",20);
        Reserva res2=new Reserva("sergio",22,1232345,"12/11/2024",130);
        Reserva res3=new Reserva("andrea",33,232,"13/11/2024",250);
        Reserva res4=new Reserva("pepe",44,123,"14/11/2024",130);

        Instructor i1=new Instructor("Romina", 3214, 35,"Cardio y Resistencia" );
        Cliente c1=new Cliente("Luz",3214,25,45,1.66,"Bajar grasa corporal","mensual"); 
        Actividad a1=new Actividad("Area de cardio","bicicletas estaticas");//en el espacio que esta realizando la actividad
        Actividad a2=new Actividad("Area de pesas y musculatura","mancuernas");
        Actividad a3=new Actividad("Area de cardio","maquina de remo");
        LSActividad act1=new LSActividad();
        act1.adiFinal(a1);
        act1.adiFinal(a2);
        act1.adiFinal(a3);
        Sesion s1=new Sesion(c1,i1,act1,250);

        Instructor i2=new Instructor("Gerardo", 1347, 35,"Musculacion y fuerza" );
        Cliente c2=new Cliente("Alan", 21347, 19, 56, 1.66,"Definicion","dia");
        Actividad a4=new Actividad("Area de pesas y musculatura","mancuernas");
        Actividad a5=new Actividad("Area de pesas y musculatura","Banco de musculacion");
        LSActividad act2=new LSActividad();
        act2.adiFinal(a4);
        act2.adiFinal(a5);			
        Sesion s2=new Sesion(c2,i2,act2,20);

        Recursos r1=new Recursos("bicicletas estaticas",true,"bien");
        Recursos r2=new Recursos("Maquina de remo",true,"bien");
        LS_Recursos rec1=new LS_Recursos();
        rec1.adiFinal(r1);
        rec1.adiFinal(r2);
        Espacio e1=new Espacio("Area de cardio","Entrenamiento de resistencia",rec1);
        Recursos r3=new Recursos("mancuernas",true,"Bien");
        Recursos r4=new Recursos("barras",false,"en mantenimiento");
        Recursos r5=new Recursos("banco de musculacion",true,"bien");
        LS_Recursos rec2=new LS_Recursos();
        rec2.adiFinal(r3);
        rec2.adiFinal(r4);			
        rec2.adiFinal(r5);	
        Espacio e2=new Espacio("Area de pesas y mosculatura"," Ejercicio de fuerza ",rec2);
        LS_Espacio esp=new LS_Espacio();
        esp.adiFinal(e1);
        esp.adiFinal(e2);
        Gimnacio g1=new Gimnacio("EvolucionFit",1112,"ballivian",esp,20,130,250);//costos del gimnacio por dia semana y mes

        //SEGUNDO GIMNASIO
        Reserva res5=new Reserva("zamara",11,1234,"11/10/2024",30);
        Reserva res6=new Reserva("edson",44,234234,"12/10/2024",350);
        Reserva res7=new Reserva("oliver",22,4321,"13/10/2024",170);
        Reserva res8=new Reserva("carlonina",55,321,"14/10/2024",350);
        Reserva res9=new Reserva("tania",55,321,"14/10/2024",350);
        Reserva res10=new Reserva("deymar",55,321,"14/10/2024",30);

        Instructor i3=new Instructor("Roberto", 115499, 35,"Entrenamiento Funcional y Crossfit" );
        Cliente c3=new Cliente("Gabriel", 221345, 20, 59, 1.70, "Mejorar la salud General","Mes"); 
        Actividad a6=new Actividad("Espacio Funcional o Crossfit","Dominadas");
        Actividad a7=new Actividad("Espacio Funcional o Crossfit","Cuerdas");
        Actividad a8=new Actividad("Area de pesas y Musculatura ","Mancuernas");
        Actividad a9=new Actividad("Area de pesas y Musculatura ","Barras");
        LSActividad act3=new LSActividad();
        act3.adiFinal(a6);
        act3.adiFinal(a7);
        act3.adiFinal(a8);
        act3.adiFinal(a9);
        Sesion s3=new Sesion(c3,i3,act3,350);

        Instructor i4=new Instructor("Carlos", 23423, 40,"Personal Trainer" );
        Cliente c4=new Cliente("Edson", 234234, 21, 62, 1.67,"Definicion","dia");
        Actividad a10=new Actividad("Area de cardio","Trotar en cintas de correr");
        Actividad a11=new Actividad("Area de pesas y musculacion","Mancuernas");
        Actividad a12=new Actividad("Espacio Funcional o Crossfit","Dominadas");
        LSActividad act4=new LSActividad();
        act4.adiFinal(a10);
        act4.adiFinal(a11);
        act4.adiFinal(a12);
        Sesion s4=new Sesion(c4,i4,act4,30);

        Instructor i5=new Instructor("Carla",534662,36,"Yoga y Flexibilidad" );
        Cliente c5=new Cliente("Yessica", 13625, 17, 53, 1.61, "Flexibididad","semana");
        Actividad a13=new Actividad("Zona de estiramientos y Core","Colchonetas");
        Actividad a14=new Actividad("Zona de estiramientos y Core","Pelotas de yoga");
        Actividad a15=new Actividad("Zona de estiramientos y Core","Bandas elasticas");
        LSActividad act5=new LSActividad();
        act5.adiFinal(a13);
        act5.adiFinal(a14);
        act5.adiFinal(a15);
        Sesion s5=new Sesion(c5,i5,act5,170);

        Instructor i6=new Instructor("Carmen", 23423, 40,"Reabilitacion y Fisioterapia" );
        Cliente c6=new Cliente("Iver", 456322, 18, 51, 1.71, "mejora de la movilidad","mensual");
        Actividad a16=new Actividad("Zona de Fisioterapia","evaluacion postural");
        Actividad a17=new Actividad("Zona de Fisioterapia","Ejercicios terapeuticos");
        LSActividad act6=new LSActividad();
        act6.adiFinal(a16);
        act6.adiFinal(a17);			
        Sesion s6=new Sesion(c6,i6,act6,350);

        Recursos r6=new Recursos("cajones de salto",true,"bien");
        Recursos r7=new Recursos("cuerdas de batalla",false,"en mantenimiento");
        Recursos r8=new Recursos("ketlebells",true,"bien");
        Recursos r9=new Recursos("Barras para dominadas",true,"bien");
        LS_Recursos rec3=new LS_Recursos();
        rec3.adiFinal(r6);
        rec3.adiFinal(r7);
        rec3.adiFinal(r8);
        rec3.adiFinal(r9);
        Espacio e3=new Espacio("Espacio Funcional o Crossfit","Ejercicios de alta intencidad",rec3);

        Recursos r10=new Recursos("Maquina de remo",true,"bien");
        Recursos r11=new Recursos("Bicicletas estaticas",true,"bien");
        Recursos r12=new Recursos("Elipticas",true,"bien");
        Recursos r13=new Recursos("Cintas de correr",true,"En mantenimiento");
        LS_Recursos rec4=new LS_Recursos();
        rec4.adiFinal(r10);
        rec4.adiFinal(r11);
        rec4.adiFinal(r12);
        rec4.adiFinal(r13);
        Espacio e4=new Espacio("Area de cardio","Entrenamiento de resistencia y quema de calorias",rec4);

        Recursos r14=new Recursos("Pesas libres",true,"bien");
        Recursos r15=new Recursos("Mancuernas",true,"bien");
        Recursos r16=new Recursos("Barras Banco de musculacion",true,"bien");
        Recursos r17=new Recursos("Raks de sentadillas",true,"bien");
        LS_Recursos rec5=new LS_Recursos();
        rec5.adiFinal(r14);
        rec5.adiFinal(r15);
        rec5.adiFinal(r16);
        rec5.adiFinal(r17);
        Espacio e5=new Espacio("Area de pesas y Musculacion","Ejercicio de Fuerza",rec5);

        Recursos r18=new Recursos("Colchonetas",true,"bien");
        Recursos r19=new Recursos("Pelotas de yoga",false,"bien");
        Recursos r20=new Recursos("Bandas estaticas",true,"bien");

        LS_Recursos rec6=new LS_Recursos();
        rec6.adiFinal(r18);
        rec6.adiFinal(r19);
        rec6.adiFinal(r20);
        Espacio e6=new Espacio("Zona de Estiramiento y core","Enfriamiento flexibilidad y trabajo de abdomen",rec6);

        LS_Espacio esp1=new LS_Espacio();
        esp1.adiFinal(e3);
        esp1.adiFinal(e4);
        esp1.adiFinal(e5);
        esp1.adiFinal(e6);

        Gimnacio g2=new Gimnacio("SayaGim",2221,"PuraPura",esp1,30,170,350);

//	
        //TERCER GIMNACIO
        Reserva res11=new Reserva("esteban",11,1234,"11/10/2024",50);
        Reserva res12=new Reserva("pablo",44,12345,"12/10/2024",200);
        Reserva res13=new Reserva("alvaro",22,4321,"13/10/2024",500);
        Reserva res14=new Reserva("andres",55,321,"14/10/2024",500);
        Reserva res15=new Reserva("yordan",55,321,"14/10/2024",200);

        Instructor i7=new Instructor("Alejandro", 1052235, 31,"Clases Grupales" );
        Cliente c7=new Cliente("Pepito", 44543, 34, 53, 1.68, "Mejora de rendimiento","mes"); 
        Actividad a18=new Actividad("Sala de clases Grupales","zumba");
        Actividad a19=new Actividad("Sala de clases grupales","Pilates");
        Actividad a20=new Actividad("Area de cardio ","Maquina de remo");
        LSActividad act7=new LSActividad();
        act7.adiFinal(a18);
        act7.adiFinal(a19);
        act7.adiFinal(a20);
        Sesion s7=new Sesion(c7,i7,act7,500);

        Instructor i8=new Instructor("Marcelo", 2355831, 39,"Personal Trainer" );
        Cliente c8=new Cliente("Julio", 46634, 32, 61, 1.60,"Aumento de Masa Muscular","mes");
        Actividad a21=new Actividad("Area de Pesas y Musculacion","Banco de Musculacion");
        Actividad a22=new Actividad("Area de pesas y Musculacion","Mancuernas");
        LSActividad act8=new LSActividad();
        act8.adiFinal(a21);
        act8.adiFinal(a22);
        Sesion s8=new Sesion(c8,i8,act8,500);

        Instructor i9=new Instructor("Pablo",224562,36,"Personal Trainer" );
        Cliente c9=new Cliente("Wilder", 115406, 21, 52, 1.65, "Aumento de Masa muscular","semana");
        Actividad a23=new Actividad("Area de Pesas y Musculacion","Mancuernas");
        Actividad a24=new Actividad("Espacio Funcional o Crossfit","Dominadas");
        Actividad a25=new Actividad("Area de Pesas y Musculacion","Barras");
        LSActividad act9=new LSActividad();
        act9.adiFinal(a23);
        act9.adiFinal(a24);
        act9.adiFinal(a25);
        Sesion s9=new Sesion(c9,i9,act9,200);

        Recursos r21=new Recursos("cajones de salto",true,"bien");
        Recursos r22=new Recursos("cuerdas de batalla",true,"bien");
        Recursos r23=new Recursos("Barras para dominadas",true,"bien");
        LS_Recursos rec7=new LS_Recursos();
        rec7.adiFinal(r21);
        rec7.adiFinal(r22);
        rec7.adiFinal(r23);
        Espacio e7=new Espacio("Espacio Funcional o Crossfit","Ejercicios de alta intencidad",rec7);

        Recursos r24=new Recursos("Maquina de remo",true,"bien");
        Recursos r25=new Recursos("Bicicletas estaticas",true,"bien");
        Recursos r26=new Recursos("Elipticas",true,"bien");
        Recursos r27=new Recursos("Cintas de correr",true,"bien");
        LS_Recursos rec8=new LS_Recursos();
        rec8.adiFinal(r24);
        rec8.adiFinal(r25);
        rec8.adiFinal(r26);
        rec8.adiFinal(r27);
        Espacio e8=new Espacio("Area de cardio","Entrenamiento de resistencia y quema de calorias",rec8);

        Recursos r28=new Recursos("Pesas libres",true,"bien");
        Recursos r29=new Recursos("Mancuernas",true,"bien");
        Recursos r30=new Recursos("Barras Banco de musculacion",true,"bien");
        LS_Recursos rec9=new LS_Recursos();
        rec9.adiFinal(r28);
        rec9.adiFinal(r29);
        rec9.adiFinal(r30);
        Espacio e9=new Espacio("Area de pesas y Musculacion","Ejercicio de Fuerza",rec9);

        Recursos r31=new Recursos("Colchonetas",true,"bien");
        Recursos r32=new Recursos("Pelotas de yoga",false,"bien");
        Recursos r33=new Recursos("Bandas estaticas",true,"bien");

        LS_Recursos rec10=new LS_Recursos();
        rec10.adiFinal(r31);
        rec10.adiFinal(r32);
        rec10.adiFinal(r33);
        Espacio e10=new Espacio("Zona de Estiramiento y core","Enfriamiento flexibilidad y trabajo de abdomen",rec10);

        Recursos r34=new Recursos("Espejos",true,"bien");
        Recursos r35=new Recursos("colchonetas",false,"bien");
        Recursos r36=new Recursos("bicicletas de Spinning",true,"bien");
        Recursos r37=new Recursos("Sistema de Sonido",true,"bien");
        LS_Recursos rec11=new LS_Recursos();
        rec11.adiFinal(r34);
        rec11.adiFinal(r35);
        rec11.adiFinal(r36);
        rec11.adiFinal(r37);
        Espacio e11=new Espacio("Sala de clases Grupales","Clases de zumba, Spinning",rec11);

        LS_Espacio esp2=new LS_Espacio();
        esp2.adiFinal(e7);
        esp2.adiFinal(e8);
        esp2.adiFinal(e9);
        esp2.adiFinal(e10);
        esp2.adiFinal(e11);

        Gimnacio g3=new Gimnacio("TitanFitnes",3332,"CotaCota",esp2,50,200,500);

        LD_Gimnacio gym=new LD_Gimnacio();
        gym.adiFinal(g1);
        gym.adiFinal(g2);
        gym.adiFinal(g3);
//		gym.adiFinal(g4);


        MultiColaS sesiones=new MultiColaS(3);

        sesiones.adicionar(0, s1);
        sesiones.adicionar(0, s2);
        sesiones.adicionar(1, s3);
        sesiones.adicionar(1, s4);
        sesiones.adicionar(1, s5);
        sesiones.adicionar(1, s6);
        sesiones.adicionar(2, s7);
        sesiones.adicionar(2, s8);
        sesiones.adicionar(2, s9);


        MulticolaR reservas=new MulticolaR(3);
        reservas.adicionar(0, res1);
        reservas.adicionar(0, res2);
        reservas.adicionar(0, res3);
        reservas.adicionar(0, res4);
        reservas.adicionar(1, res5);
        reservas.adicionar(1, res6);
        reservas.adicionar(1, res7);
        reservas.adicionar(1, res8);
        reservas.adicionar(1, res9);
        reservas.adicionar(1, res10);
        reservas.adicionar(2, res11);
        reservas.adicionar(2, res12);
        reservas.adicionar(2, res13);
        reservas.adicionar(2, res14);
        reservas.adicionar(2, res15);

        mostrandogym(gym,sesiones,reservas);
        System.out.println("=======================");
        //mostras las ganancias de cada gimnacio con su nombre del gimnacio
        mostrandoganancias(sesiones,gym);
        System.out.println("=======================");
        //mostrar cuantos clientes tiene cada gimnasio
        mostrandocantidadclientes(sesiones,gym);
        System.out.println("=======================");
        //buscar el gimnasio "x"  al cliente "y" verficar si hizo reserva o no, si hizo reserva  mostrar "si hizo su reserva" caso contrario "no hizo su reserva"
        verificando(gym,sesiones,reservas,"SayaGim","Edson");
                
        // INICIO DEL PROGRAMA
        
        CentroControl interfaz = new CentroControl(sesiones,reservas);
        interfaz.setVisible(true);
        interfaz.setLocationRelativeTo(interfaz);
        Principal a = new Principal(sesiones);
        a.setVisible(true);
        a.setLocationRelativeTo(a);
    }
    private static void verificando(LD_Gimnacio gym, MultiColaS ses, MulticolaR res, String x,String y) {
            NodoGimnacio auxG=gym.getP();
            int cont=0;
            for(int i = 0 ; i < gym.nroNodos() ; i++) {
                    if(auxG.getZ().getNombre().equals(x)) {
                            cont=1;
                            ColaS auxS=new ColaS();
                            while(!ses.getV()[i].esvacia()) {
                                    Sesion elem = ses.getV()[i].eliminar();
                                    if(elem.getCliente().getNombre().equals(y)) {
                                            cont=2;
                                            ColaR auxR=new ColaR();
                                            boolean sw=false;
                                            while(!res.getV()[i].esvacia()) {
                                                    Reserva abc=res.getV()[i].eliminar();
                                                    if(abc.getCi()==elem.getCliente().getCi()) {
                                                            cont=3;
                                                            sw=true;
                                                    }
                                                    auxR.adicionar(abc);
                                            }
                                            res.getV()[i].vaciar(auxR);
                                            if(sw)System.out.println("Si hizo su reserva el cliente: "+y+ " En el gimnacio " +x);
                                            else System.out.println("No hizo su reserva el cliente: " +y+ " En el gimnacio " +x);
                                    }
                                    auxS.adicionar(elem);
                            }
                            ses.getV()[i].vaciar(auxS);
                    }
                    auxG=auxG.getSig();
            }
            if(cont==0)System.out.println("no existe el gimnasio buscado..");
            if(cont==1)System.out.println("no existe el cliente buscado....");
    }
    private static void mostrandocantidadclientes(MultiColaS sesiones, LD_Gimnacio gym) {
            NodoGimnacio auxG=gym.getP();
            for(int i = 0 ; i < gym.nroNodos() ; i++) {
                    System.out.println("El gimnacio "+auxG.getZ().getNombre()+"  Tiene = "+sesiones.getV()[i].nroelem()+ " clientes");
                    auxG=auxG.getSig();
            }
    }
    private static void mostrandoganancias(MultiColaS sesiones, LD_Gimnacio gym) {
            NodoGimnacio auxG=gym.getP();
            for(int i = 0 ; i < gym.nroNodos() ; i++) {
                    ColaS auxS=new ColaS();
                    int sum=0;

                    while(!sesiones.getV()[i].esvacia()) {
                            Sesion elem=sesiones.getV()[i].eliminar();
                            sum=sum+elem.getDia();
                            auxS.adicionar(elem);
                    }
                    sesiones.getV()[i].vaciar(auxS);
                    System.out.println(" El Gimnacio "+auxG.getZ().getNombre()+" Tiene una ganancia de = "+sum);
                    auxG=auxG.getSig();
            }
    }
    private static void mostrandogym(LD_Gimnacio gym, MultiColaS sesiones, MulticolaR reservas) {
            NodoGimnacio auxG=gym.getP();
            for (int i = 0; i < gym.nroNodos(); i++) {
                    auxG.getZ().mostrar();
                    sesiones.mostrar(i);
                    reservas.mostrar(i);
                    System.out.println();
                    auxG=auxG.getSig();
            }	
    }
}


