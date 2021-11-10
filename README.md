# The following repository consists of Data Structure And Algorithms.

![DSA-MSA-Technosoft](https://user-images.githubusercontent.com/57039695/141152912-65cd8d56-eb86-4dba-aaab-7692484e6aca.png)

## ✨ ARRAYS

### 1.) Searching : 

#### Linear Search - Linear Search is used to search an element from multiple elements.
    Complexity    - The best case is O(n) (when the element is present at first index).
                    The worst case complexity is O(n) (when element is present at last index).
                    
#### Binary Search - Binary Search is used to find an element from multiple elements. It is much faster than Linear Search.
    Complexity    - The best case is O(n) (when the element is present at middle index at first).
                    The complexity is  O(logn).

### 2.) Sorting :

#### Bubble Sort - Bubble Sort is the simplest sorting technique in java to sort array elements. The idea is to traverse the array from starting elememt to the last element by camparing the adjacent elements and swapping them if they are not in specific order.
                  
    Complexity  - The Worst and average case complexity is O(n2).
                  The best case complexity is O(n) (when the array is already sorted ).
                  
#### Insertion Sort - Insertion Sort is a simple algorithm that works the way we sort playing card in our hands. We choose one card and insert it in its position (ascending or descending).
    Complexity     - The worst and average time complexity is O(n2).
                     The best case time complexity is O(n).
                    
#### Selection Sort - Selection Sort is the combination of searching and sorting. It sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. In every iteration of selection sort, the minimum element from the unsorted subarray is picked and moved to                          sorted subarray.
    Complexity     - The time complexity is O(n2).
    
####  Quick Sort     - Divide: Rearrange the elements and split the array into two subarrays and an element (known as pivot) in between such that each element in the left                              subarray is less than or equal to pivot element and each element in the right subarray is greater than the pivot element. Conquer: Recusively sort the two subarrays. Combine: The solution of two sub problems to create a solution to the original problem.
                     
    Complexity     - The best and average time complexity is O(n * logn).
                     The worst time complexity is O(n2).
      
## ✨ TREES

### Tree can be defined as a collection of entities (nodes) linked togeher to stimulate a hierarchy.

#### ⬜ROOT --> The topmost node having no parent element is the root of the tree.

#### ⬜NODES --> They contain the information and also the link to next/successer node.

#### ⬜PATH --> The sequence of consecutive edges from source nodes to destination node.

#### ⬜ANCESTOR --> any predecessor node on the path from root to that node.

#### ⬜DECENDENT --> any successor node on the path from root to that node.

#### ⬜SUBTREE --> The node of subtree must be joined with root and it should then contain all its desendent.

#### ⬜SIBLING --> Nodes which consists of same parent are sibling.

#### ⬜DEGREE --> Number of children of the node is the degree of that node.

#### ⬜DEGREE OF TREE --> The maximum degree of any node of the tree is known as degree of that tree.

#### ⬜DEPTH OF NODE --> Length of path from root to that node.

#### ⬜HEIGHT OF NODE --> NO. of edges in the longest path from that node to a leaf.
                    Height of root node = longest path (path consisting of max. number of edges).
                    Also height of the tree is longest path of root node.
                    Level of a tree = height of tree.
                    
### *Tree examples:*

File System, Human Generation

### Binary Tree and its type:

In binary tree, each node can have atmost/ maximun 2 nodes (children).
Maximum no. of nodes possible at any level i is 2^i.

#### Types of Binary Tree:

- Full/ Proper/ Strict

- Complete Binary Tree

- Perfect Binary Tree

- Degenerate Binary Tree

#### *Full/ Proper/ Strict* -->

Each Node have either 0 or 2 nodes. No. of leaf nodes = no. of interval nodes + 1;

#### *Complete Binary Tree* -->

All the levels are completely filled (except possibly the last level). The last level has nodes as left as possible.

#### *Perfect Binary Tree* -->

All internal nodes have 2 children and all leaves are at same level. Every perfect tree can be full binary tree  and complete binary tree.

#### *Degenerate Binary Tree* -->

All the internal nodes have 1 children.



