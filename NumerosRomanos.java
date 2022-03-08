class NumerosRomanos {
    
    public String numToRomano(Integer num){
     String Resultado="";
     
        if (num>0 && num<10){
            Resultado = traeUnidad(num);
        } 
        if (num>9 && num<100){
            Resultado =traeDecena(num);
        }   
        if (num>99 && num<1000){
            Resultado = traeCentena(num);
        } 
        if (num==1000){
            Resultado="M";
        }    
        
    return Resultado;
    }
    
    public static String  traeUnidad(int num){
        String Resultado="";
        
        switch(num){
        
            case 1:
                Resultado="I";
                break;
            case 2:
                Resultado="II";
                break;
            case 3:
                Resultado="II";
                break;
            case 4:
                Resultado="IV";
                break;
            case 5:
                Resultado="V";
                break;
            case 6:
                Resultado="VI";
                break;
            case 7:
                Resultado="VII";
                break;
            case 8:
                Resultado="VIII";
                break;
            case 9:
                Resultado="IX";
                break;     
        }
        
    return Resultado;
    }
    
        public static String  traeDecena(int num){
        String Resultado="";
        
        switch(num){
        
            case 10:
                Resultado="X";
                break;
            case 20:
                Resultado="XX";
                break;
            case 30:
                Resultado="XXX";
                break;
            case 40:
                Resultado="IL";
                break;
            case 50:
                Resultado="L";
                break;
            case 60:
                Resultado="LI";
                break;
            case 70:
                Resultado="LII";
                break;
            case 80:
                Resultado="LIII";
                break;
            case 90:
                Resultado="IC";
                break;       
        }
        
    return Resultado;
    }
        
    public static String traeCentena(int num){
        String Resultado="";
        
        switch(num){
        
            case 100:
                Resultado="C";
                break;
            case 200:
                Resultado="CC";
                break;
            case 300:
                Resultado="CCC";
                break;
            case 400:
                Resultado="CD";
                break;
            case 500:
                Resultado="D";
                break;
            case 600:
                Resultado="DC";
                break;
            case 700:
                Resultado="DCC";
                break;
            case 800:
                Resultado="DCCC";
                break;
            case 900:
                Resultado="CM";
                break;     
        }
        
    return Resultado;
    }
}
