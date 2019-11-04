package org.wso2.tree;

public class CompilationUnit {
//    private List<Node> topLevelNodes = new ArrayList<>();
    private NatP natP;
    private NatS natS;

    public CompilationUnit(NatS natS) {
        this.natS = natS;
    }

    public CompilationUnit(NatP natP) {
        this.natP = natP;
    }

    public CompilationUnit(NatP natP, NatS natS) {
        this.natP = natP;
        this.natS = natS;
    }

    public NatP getNatP() {
        return natP;
    }

    public NatS getNatS() {
        return natS;
    }

}
