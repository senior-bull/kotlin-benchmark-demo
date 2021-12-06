Build:
```
mvn clean package
```

Note: need clean package every time, otherwise removed benchmarks will be hanging around.

Run:
```
java -jar target/benchmarks.jar
```

Fast check:
```
java -jar target/benchmarks.jar -wi 0 -i 1 -f 1 -tu ns -bm avgt
```

Analyze:
```
java -jar target/benchmarks.jar -wi 20 -i 10 -f 1 -tu ns -bm avgt -rf text -rff results/benchmarks-8.txt -o log.txt
```