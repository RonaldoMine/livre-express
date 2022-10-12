package Models;

public class Reference {
    private int codeCom;
    private int codeProd;
    private int qteCom;
    
    public Reference(int codeC , int codeP , int qte){
        this.codeCom = codeC;
        this.codeProd = codeP;
        this.qteCom = qte;
    }

    public Reference() {
    }
    
    public int getCodeCom() {
        return codeCom;
    }

    public int getCodeProd() {
        return codeProd;
    }

    public int getQteCom() {
        return qteCom;
    }
    
    
}
