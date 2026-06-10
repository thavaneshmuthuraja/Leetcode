/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* dummy=new ListNode (-1);
        ListNode* d=new ListNode(-1);

        dummy->next=d;
        int carry=0, sum=0;

        while(l1!=NULL && l2!=NULL)
        {
            sum=(l1->val+l2->val)+carry;

            ListNode* t=new ListNode(sum%10);
            d->next=t;
            d=d->next; 
            carry=sum/10;
            l1=l1->next;
            l2=l2->next;
        }

        while(l1!=NULL)
        {
            int s=(l1->val+carry);
            ListNode* t=new ListNode(s%10);
            d->next=t;
            d=d->next;
            l1=l1->next;
            carry=s/10;
        }
        while(l2!=NULL)
        {
             int s=(l2->val+carry);
            ListNode* t=new ListNode(s%10);
            d->next=t;
            d=d->next;
            l2=l2->next;
            carry=s/10;
        }
        if(carry) d->next=new ListNode(carry);
        return dummy->next->next;
    }
};