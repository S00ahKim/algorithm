package code;

import java.util.Scanner; 
class Node { 
    Node rightNode; 
    Node leftNode; 
    int value; 
    Node(int value) { 
        this.value = value; 
    } 
} 

// 채점을 위해 클래스명을 Main으로 지정함. 

public class Main{ 
    StringBuilder nodesb = new StringBuilder(); 
    
    public StringBuilder getNodesb() { 
        return nodesb; 
    } 
    
    public void setNodesb(StringBuilder nodesb) { 
        this.nodesb = nodesb; 
    } 
    
    public static void main(String[] args) { 
        //// START : 노드에 값 입력. 
        Scanner scan = new Scanner(System.in);
        int inputValue = scan.nextInt(); 
        Node node = new Node(inputValue); 
        
        while (scan.hasNext()) { 
            try { 
                inputValue = scan.nextInt(); 
                node = nodeInsert(node, inputValue); 
            } catch (Exception e) { 
                //	e.printStackTrace(); 
                System.out.println("숫자만을 입력해야 합니다. 종료합니다."); 
                break; 
            } 
        } //// END : 노드에 값 입력 
        
        //// START : 후위순회 출력 
        
        Main myClass = new Main(); 
        StringBuilder resultsb = myClass.getNodesb(); 
        myClass.findNode(node); 
        System.out.println(resultsb); 
        //// END : 후외순회 출력 
    } // end main method 
    
    public static Node nodeInsert(Node node, int inputValue) { 
        Node currentNode = null; 
        if (node == null) { 
            return new Node(inputValue); 
        } 
        
        if (node.value > inputValue) { 
            // leftNode로 추가 
            currentNode = nodeInsert(node.leftNode, inputValue); 
            node.leftNode = currentNode; 
        } else if (node.value < inputValue) { 
            // rightNode로 추가 
            currentNode = nodeInsert(node.rightNode, inputValue); 
            node.rightNode = currentNode; 
        } 
        
        return node; 
    } // end nodeCheck 
    
    public Node findNode(Node node) { 
        Node currentNode = null; 
        if (node.leftNode != null && node.rightNode != null) { 
            node.leftNode = findNode(node.leftNode); 
            node.rightNode = findNode(node.rightNode); 
        } 
        
        if(node.leftNode == null && node.rightNode == null){ 
            nodesb.append(node.value + "\n"); 
            node = null; 
        }else if(node.leftNode==null && node.rightNode!=null){ 
            findNode(node.rightNode); 
            nodesb.append(node.value + "\n"); 
            node = null; 
        }else if(node.leftNode!=null && node.rightNode==null){ 
            findNode(node.leftNode); 
            nodesb.append(node.value + "\n"); 
            node = null; 
        } 
        setNodesb(nodesb); 
        return node; 
    } 
}
