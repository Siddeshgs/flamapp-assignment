# Flamapp.AI Assignment  
Android + Native (C++) + OpenCV + Kotlin + Web (Optional)

This repository contains my complete solution for the Flamapp.AI internship assignment.  
The project includes:

- Android (Kotlin)
- NDK + JNI integration
- OpenCV Android SDK (native)
- C++ Image processing demo
- Optional TypeScript web module
- Proper structured commit history

---

# 🔥 Features Implemented

### ✅ Android (Kotlin)
- Kotlin MainActivity
- Calls native C++ function using JNI
- Displays OpenCV output on screen

### ✅ Native (C++ / NDK)
- Working `native-lib.cpp`
- OpenCV included via Android SDK
- Test Mat creation to verify OpenCV load
- CMake configured

### ✅ OpenCV Integration
- Pure native OpenCV (not Java binding)
- Linked through CMake
- Verified using `cv::Mat::zeros()`

### ✅ Web (Optional)
- Node.js / TypeScript backend for frame-flow
- Basic server stub provided

---

# 📁 Project Structure

```
app/
  src/main/cpp/
      native-lib.cpp
      CMakeLists.txt
      OpenCV/
         sdk/
           native/jni/OpenCVConfig.cmake
  src/main/java/com/example/flamapp_ai_assignment/
      MainActivity.kt
screenshots/
README.md
web/ (optional)
```

---

# 🛠 Setup Instructions (NDK + OpenCV)

### 1. Install Requirements
- Android Studio
- NDK (from SDK Manager)
- CMake (3.10+)
- OpenCV-4.10.0 Android SDK

### 2. Copy OpenCV SDK
Extract:

```
OpenCV-android-sdk/
```

Copy folder:

```
sdk/
```

into:

```
app/src/main/cpp/OpenCV/
```

Final path must contain:

```
app/src/main/cpp/OpenCV/sdk/native/jni/OpenCVConfig.cmake
```

### 3. CMakeLists.txt
Configured to detect OpenCV via:

```
set(OpenCV_DIR ${CMAKE_SOURCE_DIR}/OpenCV/sdk/native/jni)
find_package(OpenCV REQUIRED)
```

### 4. Run the App
You should see:

```
OpenCV Loaded | Mat Size = 200x200
```

---

# 🧠 Architecture Overview

### Frame Flow
```
Kotlin Activity
    ↓ JNI
C++ native-lib.cpp
    ↓
OpenCV processing
    ↓
Return string result to Kotlin
```

### Components
- **Kotlin UI Layer** → Loads native library  
- **JNI Bridge** → Connects JVM to C++  
- **C++ Core** → Uses OpenCV  
- **OpenCV SDK** → Native libraries  

---

# 🖼 Screenshots

Located in `/screenshots/`:

- `app_output.png` – JNI + OpenCV result
- `project_structure.png` – Android Studio structure
- `opencv_folder.png` – OpenCV SDK validation
- `architecture_diagram.png` – Frame flow diagram
- `web_server_running.png` – Web module (if used)

---

# 🌐 Web / TypeScript (Optional)
Inside `web/`:
- `index.ts` – server entry point
- `frameProcessor.ts` – sample processor
- `npm start` to run

---

# 📮 Submission
This repo includes:
- Clean commit history
- README with setup
- Screenshots
- Android + C++ + OpenCV code
- Optional TypeScript module

