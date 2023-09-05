/*
// Definition for a Node.
class Node {
public:
    int val;
    Node* next;
    Node* random;
    
    Node(int _val) {
        val = _val;
        next = NULL;
        random = NULL;
    }
};
*/

class Solution {
public:
    void copyList(Node *head){
        Node *curr=head;
        while(curr!=NULL){
            Node *forw=curr->next;
            Node *node=new Node(curr->val);
            
            curr->next=node;
            node->next=forw;
            curr=forw;
        }
    }
    
    void copyRandomPointer(Node *head){
        Node *curr=head;
        while(curr!=NULL){
            Node *random=curr->random;
            if(random!=NULL)
            curr->next->random=random->next;
            
            curr=curr->next->next;
        }
    }
    
    Node *extractDeepCopy(Node *head){
        Node *dummy=new Node(-1);
        Node *prev=dummy;
        Node *curr=head;
        
        while(curr!=NULL){
            prev->next=curr->next;
            curr->next=curr->next->next;
            
            curr=curr->next;
            prev=prev->next;
        }
        return dummy->next;
    }
    
    Node* copyRandomList(Node* head) {
        copyList(head);
        copyRandomPointer(head);
        return extractDeepCopy(head);
    }
};