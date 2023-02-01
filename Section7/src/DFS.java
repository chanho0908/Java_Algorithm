class Node{
    int data;
    Node lt,rt; // 다음 노드를 가르키는 주소
                // 이 주소를 기준으로 트리의 자식 노드를 탐색한다.
    public Node(int data){
        this.data = data;
        lt=rt=null;
    }
}

public class DFS {
    Node root;
    public void DFS(Node root){
        if (root == null) return;
        else {
            System.out.print(root.data + " "); // 전위 순회
            DFS(root.lt);
            // System.out.print(root.data + " "); // 중위 순회
            DFS(root.rt);
            // System.out.print(root.data + " "); // 후위 순회
        }
    }

    public static void main(String[] args) {
        DFS tree = new DFS();
        tree.root = new Node(1); // 루트 노드
        tree.root.lt = new Node(2); // 루트의 자식 노드
        tree.root.rt = new Node(3); // 루트의 자식 노드
        tree.root.lt.lt = new Node(4); // DFS(2) 의 자식 노드
        tree.root.lt.rt = new Node(5); // DFS(2) 의 자식 노드
        tree.root.rt.lt = new Node(6); // DFS(3) 의 자식 노드
        tree.root.rt.rt = new Node(7); // DFS(3) 의 자식 노드
        tree.DFS(tree.root);
    }
}
