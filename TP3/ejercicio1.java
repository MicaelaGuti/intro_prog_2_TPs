class ejercicio1{


    // RESTAS 
    //MCD(X,X)=X  X<Y⇒MCD(X,Y)=MCD(Y,X)  X>Y⇒MCD(X,Y)=MCD(X−Y,Y) 

    public static int mcd(int x, int y){
        if(x==y){
            return x; 
        }
        if(x<y){
            return mcd(y,x); 
        }
        return mcd(x-y, y); 
    }

    //MODULO 
    // MCD(X,0)=X     X<Y⇒MCD(X,Y)=MCD(Y,X)        X≥Y⇒MCD(X,Y)=MCD(Y,MOD(X,Y))
    public static int mcdModulo(int x, int y){
        if(y==0){
            return x; 
        }
        if(x<y){
            return mcdModulo(y, x); 
        }
        return mcdModulo(y, x%y); 
    }

   
}

