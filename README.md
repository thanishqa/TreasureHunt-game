# 🏴‍☠️ Treasure Hunt (Java Console Game)

A simple **Java console-based adventure game** where the player fights, searches for treasure, or rests to manage health and collect coins.  
The goal: **Reach 100 coins to win** before your health reaches zero!

---

## 📜 Game Rules
- **Health** starts at `100`
- **Coins** start at `0`
- Choose from the menu each turn:
  1. **Fight** 🗡️ → Lose 20 health, gain 10 coins
  2. **Search** 🔍 → Lose 10 health, gain 20 coins
  3. **Rest** 🛌 → Gain 15 health, lose 5 coins
  4. **Check Status** 📊 → View current health and coins
  5. **Exit** 🚪 → End the game
- **Win condition:** Reach **100 coins**
- **Lose condition:** Health drops to **0 or below**

---

## 📂 Project Structure
TreasureHunt/
│-- src/
│ └── TreasureHunt.java
│-- README.md

yaml
Copy
Edit

---

## 🛠️ Technologies Used
- **Language:** Java
- **Java Version:** 8 or higher
- **Libraries:** java.util.Scanner
- **IDE Recommended:** IntelliJ IDEA, Eclipse, or VS Code

---

## 🚀 How to Run

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/<your-username>/TreasureHunt.git

2️⃣ Navigate to the src Folder
bash
Copy
Edit
cd TreasureHunt/src
3️⃣ Compile the Java File
bash
Copy
Edit
javac TreasureHunt.java
4️⃣ Run the Game
bash
Copy
Edit
java TreasureHunt
💻 Example Gameplay
markdown
Copy
Edit
Welcome to Treasure Hunt!
starting value health 100
starting value coin 0
MENU
1. Fight
2. Search
3. Rest
4. CheckStatus
5. Exit
enter your choice: 2
your health is 90
your coin is 20
...
Winner
Game over


