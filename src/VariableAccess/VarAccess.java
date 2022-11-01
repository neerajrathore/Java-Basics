package VariableAccess;

public class VarAccess
{
    //Private member variable
    private String privateMemberVariable = null;

    //Private member method
    private String privateMethod(){
        return privateMemberVariable;
    }

    public VarAccess(String str) {
        privateMemberVariable = str;
    }

    public void demoAccessOtherClass(VarAccess otherInstance)
    {
        //Access private members of second instance
        System.out.println("Private member variable :" + otherInstance.privateMemberVariable);
        System.out.println("Private member method :" + otherInstance.privateMethod());
    }

    public static void main(String[] args) {
        VarAccess firstInstance = new VarAccess("first instance");
        VarAccess secondInstance = new VarAccess("second instance");

        firstInstance.demoAccessOtherClass(secondInstance);
    }
}
