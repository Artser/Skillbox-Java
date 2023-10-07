# Цели практической работы

Научиться работать с классом Thread.



## Что нужно сделать
1. Напишите программу уменьшения изображений на основе проекта ImageResizer. Она должна запускать число потоков, равное количеству ядер процессора вашего компьютера.
2. Используя библиотеку Imgscalr, уменьшать изображение без потери качества.
   + Согласно [инструкции ](https://sendel.notion.site/IDEA-Maven-671db52e43a6483cb2fbfb3736cdc7cf) включить поддержку сборщика maven в свой проект.
   +  [Внедрить библиотеку Imgscalr в проект ](https://mvnrepository.com/artifact/org.imgscalr/imgscalr-lib/4.2).
   + Использовать метод для уменьшения изображения.
```agsl
public static BufferedImage resize(BufferedImage src, int targetWidth,

            int targetHeight, BufferedImageOp... ops)
```

