# 📌 Project Requirements

The following requirements must be met to run this project:

## 🔹 Java 22 or Higher Required
- Ensure that **Java 22 or a later version** is installed.
- To check your Java version, run the following command in your terminal:
  
  java -version

If you are using a different Java version, you can download and install Java 22.
🔹 Maven Enforcer Plugin - Java 22 Requirement
This project uses the Maven Enforcer Plugin to enforce the Java version requirement.
If Java 22 is not installed, running mvn compile may result in the following error:

[ERROR] Rule 0: org.apache.maven.plugins.enforcer.RequireJavaVersion failed with message:
Detected JDK Version: 17 is not in the allowed range [22,).

To fix this issue, install Java 22 and set it as the default version.
🔹 Maven Installation & Usage

To verify your Maven version, run:

sh
mvn -version

📢 Important Notes for Eclipse Users
If you are using Eclipse, follow these additional steps to ensure compatibility:

Open Window > Preferences > Java > Installed JREs and ensure Java 22 is selected.
Set Project > Properties > Java Compiler > Compiler Compliance Level = 22.
Run Project > Maven > Update Project (Alt + F5) to apply the necessary changes.
💡 Following these steps ensures that the project builds and runs correctly across different environments.