import java.util.ArrayList;
import java.util.List;

public class Tree {
  Node root;
 public  boolean exist(int value){
   if(root!=null) {
     Node node = find(root, value);
     if (node != null) {
       return true;
     }
   }
     return false;
   }
 private  Node find(Node root, int value) { // обход в ширину , используется в случае отрисовки дерева, для анализа, если надо чтот вывести.
   List <Node> Line = new ArrayList<>();
   Line.add(this.root);
   while(Line.size() > 0){
   List<Node> nexttLine =  new ArrayList<>();
     for (Node node : Line){
        if (node.value == value){
          return node;
        }
        nexttLine.addAll(node.children);
     }
     Line = nexttLine;
   }
   return null;
 }
//  private Node find(Node node, int value){ // обход в глубину
//    if(node.value == value){
//      return node;
//    }else {
//      for(Node child: node.children){
//        Node result = find(child,value);
//        if (result != null){
//          return result;
//        }
//      }
//    }
//    return null;
//  }
public class Node{
  int value;
  List<Node> children;
}
}
