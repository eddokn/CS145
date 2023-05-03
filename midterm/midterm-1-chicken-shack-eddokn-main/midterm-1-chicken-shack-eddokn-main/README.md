# Chicken Shack

At the Viking Spicy Chicken shack, you can buy spicy chicken nuggets in packets of 4 pieces or 13 pieces. 
In the class `ChickenShack`, write a function `public static boolean canBuy(int n)`  that takes an integer `n` and 
returns `true` if it is possible to buy `n` pieces, or `false` otherwise.

Hint:
- Use recursion. This problem is hard to solve without recursion.
- You can't ever buy less than 4 pieces
- You can definitely buy 4 or 13 pieces
- You can buy `n` pieces if you can buy `n - 4` or `n - 13` pieces

Write your class `ChickenShack` in **ChickenShack.java**.

# Testing
There are automatic tests available if you download the code in this repo and type
```
make test
```

# Submitting
Submit to this repo to get autograded
