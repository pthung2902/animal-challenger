My comment was mark as prefix >>

1. Can you implement the sing() method for the bird?
a. How did you unit test it?
>>Write unit testing with junit

b. How did you optimize the code for maintainability?
(Ask yourself the same question for all following exercises)
>>Always do unit testing
>>Comment code and requirement
>>Unit testing
>>Code review by your-self (or pair code review) to optimise and refactor code



2.Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you
implement them to make their own special sound?
a. A duck says: “Quack, quack”
b. A duck can swim
c. A chicken says: “Cluck, cluck”
d. A chicken cannot fly (assumption: its wings are clipped but ignore that)
>>Initaly chick and Duck can fly, after evolution chicken will overidden the fly ability

3.Now how would you model a rooster?
a. A rooster says: “Cock-a-doodle-doo”
b. How is the rooster related to the chicken?
>>The rooster is a chicken
c. Can you think of other ways to model a rooster without using inheritance?
>>make chicken as an instantant of Rooster


4.Can you model a parrot? We are specifically interested in three parrots, one that
lived in a house with dogs one in a house with cats, the other lived on a farm next to
the rooster.
a. A parrot living with dogs says: “Woof, woof”
b. A parrot living with cats says: “Meow”
c. A parrot living near the rooster says: “Cock-a-doodle-doo”
d. How do you keep the parrot maintainable? What if we need another parrot
lives near a Duck? Or near a phone that rings frequently?
>>make a relation live with, based on the animal parrot live, parrot will mimic the voice of that animal


>>Count Animal based on the instance of  class implement of interface


Rest full
Using Spring MVC and Mock MVC request for testing (resf unit test attached)

