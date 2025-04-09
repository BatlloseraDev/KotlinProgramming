package walking;

public class Lista_Enlazada  <TIPO>
{
        
    private class Nodo 
    {
        //Atributos
        protected TIPO eto;
        protected Nodo sig;

        //Métodos constructores
        public Nodo()
         {
            sig=null;
            eto = (TIPO) new Object();
         }
        
         public Nodo(TIPO ti)
         {
            sig=null;
            //eto = (TIPO) new Object();
            eto = ti;
         }
    }



    //*********************************************************
    //*********************************************************
    private Nodo primero;

    
    //---------------------------------------------
    public Lista_Enlazada()
    {
        primero = null;
    }
    

   
    
    //---------------------------------------------
    public void Lista_Vacia()
    {
        primero = null;
    }
    
    
    //---------------------------------------------
    public boolean Esta_Vacia()
    {
        return primero == null;
    }
   
}
