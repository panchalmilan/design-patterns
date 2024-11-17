# Observer Pattern

### Problem:
**Design a Cricket Score board**
- You are given a blackbox that provides you: **TotalRuns**, **Overs**, **Wickets**
- You have to display analytics -
    - Run Rate Board: `CurrentRunRate`
    - Projected Board: `ProjectedScore`
    - Top Discussion Board: `Comments`
- **Note**: This should be updated as soon as possible!

**Approach 1**: **PULL Method** <br/>
Design:
![approach1.png](approach1%2Fapproach1.png)
Cons:
- There will be a _seperate thread_ to run update() method of each subscriber - ProjectedScoreBoard, RunRateBoard & TopDiscussionBoard 
- Each thread will run an infinite while loop even though data might not be updated - _wasting cpu cyles_!

**Approach 2**: **PUSH Method** <br/>
Design:
- When Publisher gets updated data, it's job is to call update() of Subscriber.
- i.e. when runs gets updated in CricketScoreBoard, it will call update() of ProjectedScoreBoard, RunRateBoard & TopDiscussionBoard
![approach2-A.png](approach2%2Fapproach2-A.png)

Cons:
- Violation of DIP (SOLI**D**):
  - Publisher is now depending upon **lot** of **concrete** Subsciber classes
- Violation of OCP (S**O**LID):
  - When number of Subsciber increase, there will be changes in Publisher class

Solution:
  - Instead of depending on concrete classes - **use interface**!
  - **Use List** instead of defining individual subscriber

**Approach 3**: **PUSH Method** <br/>
Design:
![approach3-A.png](approach3%2Fapproach3-A.png)
Cons:
- Violation of DIP (SOLI**D**):
  - Subscriber is now depending upon **concrete** Publisher classes
- Solution:
  - Create Publisher interface!

**Approach 4**: **Pub-Sub Model**<br/>
Design:
![approach4-A.png](approach4%2Fapproach4-A.png)
