package org.wso2.tree;

import java.util.ArrayList;
import java.util.List;
import org.wso2.util.Constants;

public class CompilationUnit extends Node {
    private List<Node> topLevelNodes = new ArrayList<>();

    public CompilationUnit() {
        super(Constants.COMPILATION_UNIT);
    }

}
