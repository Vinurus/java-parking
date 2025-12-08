# Bazowy obraz z Javą 17

FROM eclipse-temurin:17-jdk

# Ustaw katalog roboczy w kontenerze
WORKDIR /app

# Kopiujemy źródła do kontenera
COPY src/ ./src/

# kompilacja z włączonym trybem preview
RUN javac --enable-preview --release 17 src/javaparking/*.java -d out/

# uruchamianie też z trybem preview
CMD ["java", "--enable-preview", "-cp", "out", "javaparking.Main"]