# 🎓 EduTrack v2 — Student Performance & Attendance Analytics

## 📁 Folder Structure

```
EduTrack-v2/
├── DATABASE/          ← Run schema.sql in MySQL FIRST
├── BACKEND/           ← Spring Boot API (port 8080)
└── FRONTEND/          ← React + Vite app (port 3000)
```

## ▶️ How to Run

### 1. DATABASE
```bash
mysql -u root -p < DATABASE/schema.sql
```

### 2. BACKEND
```bash
cd BACKEND
# Edit src/main/resources/application.properties
# Change: spring.datasource.password=YOUR_MYSQL_PASSWORD
mvn spring-boot:run
```

### 3. FRONTEND
```bash
cd FRONTEND
npm install
npm run dev
# Open http://localhost:3000
```

## 🔑 Default Login
| Role    | Email                 | Password  |
|---------|-----------------------|-----------|
| Admin   | admin@edutrack.com    | admin123  |
| Teacher | teacher@edutrack.com  | admin123  |

## 🎨 Design Highlights
- **Outfit 900** font — extra-bold stat numbers with per-color text shadows
- **Color-coded stat cards** — each card has its own tinted background universe
- **Glowing neon bar chart** — gradient fills with blur glow at the tip
- **SVG donut chart** — glowing emerald center with live percentage
- **Animated counters** — numbers count up from 0 on every page load
- **JetBrains Mono** — monospace for all data (roll numbers, marks, dates)
- **Split auth screen** — features panel left, form right
- **Glassmorphism modals** — dark blur backdrop, blue gradient top border
- **Per-grade color pills** — A=emerald, B=blue, C=amber, D/F=rose
