# implement a list by storing its elements in an array

Design `List_inArraySlots` to implement a list of integers.
Your implementation required to be able to store any values that 
an `int` can hold, in consecutive slots of an array of `int`s.

In general, the array will be only partially populated with list elements.
That is, the array is generally larger than this list. 
Occasionally, the array can be completely full, but adding
another element to the list will cause the `List_inArraySlots`
class to expand the list, as described in the header comments
for the `expand()` method in the skeleton.

The requirement "to store any values that an `int` can hold" 
implies that the implementation can **not** identify the end of the list
by the values of the integers stored in the list. That design decision
would require reserving one integer value as a marker value, which would
keep the user-programmer from storing that value in the list.
Therefore, the "marker value" technique is banned for our purposes here.
(In other contexts, marker values are fine design choices.)
###Project Title: List_inArraySlots
####Members: Sergei Mishchenko, Kyra Gunluk (partner)

####Fields: 
int filledElements - counts filled elements in array
int[] list - contains an array of ints
####Constructors: 
creates an empty int array and initalizes elementsFIlled variable
####methods: 
size() - returns number of filled Elements
add (int value) - adds value to the end of the list
expand () - increases size of the list
addAtHead
expand 

###Remarks on UserOfList class:
tests edge and middle casses of methods to ensure they work
creates an instance of List_inArraySlots.
# implement a list by storing data in an encapsulated array

## features to understand
