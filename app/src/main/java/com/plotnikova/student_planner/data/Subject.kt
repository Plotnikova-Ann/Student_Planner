package com.plotnikova.student_planner.data
data class Subject(
    val id: String,
    val name: String,
    val professor: String,
    val credits: Int,
    val currentGrade: String,
    val description: String
)

val sampleSubjects = listOf(
    Subject(
        id = "1",
        name = "Разработка мобильных приложений",
        professor = "Леонтьев Д.А.",
        credits = 91,
        currentGrade = "Отлично",
        description = "Разработка нативных Android-приложений с использованием Kotlin и Jetpack Compose."
    ),
    Subject(
        id = "2",
        name = "Системное программирование",
        professor = "Токаев Т.И.",
        credits = 75,
        currentGrade = "Хорошо",
        description = "Низкоуровневая разработка на языке Rust."
    ),
    Subject(
        id = "3",
        name = "Базы данных",
        professor = "Иванова Е.В.",
        credits = 88,
        currentGrade = "Отлично",
        description = "Проектирование и оптимизация SQL и NoSQL баз данных."
    ),
    Subject(
        id = "4",
        name = "Веб-технологии",
        professor = "Петров С.А.",
        credits = 82,
        currentGrade = "Хорошо",
        description = "Современные фронтенд и бэкенд технологии."
    )
)
