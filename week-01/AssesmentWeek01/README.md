## Pre Start Set up
* [x] instantiate scanner to receive commands

## Start up
* [x] prompt for number of capsules/capacity int capacity = user input
  *  [ ] Generate capsules array
     it will be capsules[capcity]
     * array contains number of unoccupied capsules user wants
* [ ] Display confirmation message
  * "There are X unoccupied capsules..."
 
## case Main Menu
* [ ] Display main Guest Menu (see given example above)
  * [ ] initiate main while loop for navigation
  * Use Switch (Admin Action)
    * Case 1. CheckIn
    * Case 2. CheckOut
    * Case 3. View Guests
    * Case 4. Exit
* [ ] console for collecting user's menu choice
    * uses do/while for defensive validation
* [ ] choice displays/redirects to appropriate menu choice 

## 1. Check In
* [ ] print a check in header
*  [ ] prompt for Guest Name & Accept in line 
 *  [ ] prompt for room number choice
   *   [ ] store name in array at the index of room number
   *   [ ] Check occupancy
     * occupied display error and re-prompt
     * capsules[unoccupied changed to user number choice] = guest name
* Once successful, print success message and go back to main menu

## 2. Check Guest Out
* [ ] print a check out header
* [ ] prompt for capsule collect in line answer
* [ ] Check occupancy 
    * unoccupied display error "not occupied"
    * if occupied ... remove name from capsule by replacing with "unoccupied"
      * display success method and go back to main menu

## 3. View Guests
* The administrator may view guests and their capsule numbers in groups of 10.
* must keep user in bounds of number of capsules. 
* prompt for capsule # (also in line again)
* use that number to display 10 additional capsule and guest conditions
  * basically print the array with these 11 indexes from the capsules array

## 4. Exit
* print exit header
* confirm this is not a mistake
  * Exit y/n
  * if yes goodbye!
  * if no back to main menu 