# ايه هو البرنامج ده؟
- البرنامج ده هو عباره عن مثال لل Abstract Factory Design Pattern باستخدام لغة java
# بنستخدم امتي ال Design Pattern ده؟
- لما يكون عندي اكتر من Factory و عايز اجمعهم في حته واحده تبقي Factory of Factories (ال Factory Design Pattern هتلاقيه [هنا](https://github.com/poula-atef/DesignPatterns-Creational-Factory))
# بيتكون من ايه البرنامج ده ؟
- اولا package ال furniture:
  - ال package بتاعت ال Table:
    - ال Table Interface اللي بيحدد ال methods اللي في اي Table class هيعمل Implementation ليها
    - ال OldTable class و ده بيعمل implement لل Table Interface
    - ال NewTable class و ده بيعمل implement لل Table Interface
  - ال package بتاعت ال Chair:
    - ال Chair Interface اللي بيحدد ال methods اللي في اي Chair class هيعمل Implementation ليها
    - ال OldChair class و ده بيعمل implement لل Chair Interface
    - ال NewChair class و ده بيعمل implement لل Chair Interface
- ثانيا package ال factory:
  - ال FurnitureFactory و ده Factory of Factories و هما Table Factory و Chair Factory
