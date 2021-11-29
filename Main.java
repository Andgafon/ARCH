public static void main(String Args[]){
  //Iniciazión  del Scanner
  Scanner sc = new Scanner(System.in);  
  //Pedido de ingreso de datos
  System.out.println("Ingrese el nombre de la mascota:");
  String nombrePet = sc.nextLine();//Nombre de mascota
  System.out.println("Escriba la categoria de concurso que participa(TODOS, GATO, PERRO)");//Categoria de mascota
  String participacionStr = sc.nextLine();

  DirigidoA participacionEnum = DirigidoA.TODOS;

    
  if (participacionStr=="PERRO"){
    participacionEnum = DirigidoA.PERROS;
    }if(participacionStr=="GATOS"){
      participacionEnum = DirigidoA.GATOS;
    }else{
      participacionEnum = DirigidoA.TODOS;
    }
  //Definicion de Categoria de Mascota
    
  System.out.println("Ingrese el raza de la mascota:");
  String raza = sc.nextLine();
  LocalData fechaNacimiento = addDate();
  //Ingreso de fecha de nacimiento

  String foto = sc.nextLine();
  //Ingreso de foto de mascota

  crearDuenio(ArrayList<Duenio> listaDuenio, ArrayList<Ciudad> listaCiudad);
  //Definición del objeto dueño de la mascota


  Mascota  mascotaP = new Mascota(nombrePet,participacionEnum, raza, fechaNacimiento, foto, d);
  //Creación del objeto mascota
  }
