Travel App (Kotlin Multiplatform Mobile)

Travel App — это простое мобильное приложение, демонстрирующее использование Kotlin Multiplatform Mobile для разработки приложений под Android и iOS с использованием Jetpack Compose 🚀.

📱 Предпросмотр
![765434567654](https://github.com/user-attachments/assets/0349ce19-41cd-427c-9b71-ef0d38ebbb7c)
![Uploading 765434567654.png…]

▶️ Android, iOS и Desktop
Смотреть видео-демонстрацию: https://disk.yandex.ru/i/xzAfDkOJ0bRJBA

🛠️ Использованные технологии

	•	Kotlin: язык программирования.
	•	Kotlin Multiplatform: для разработки кросс-платформенных приложений в единой кодовой базе.
	•	Jetpack/JetBrains Compose Multiplatform: для создания общего интерфейса для Android, iOS и других платформ.
	•	Moko Resources: библиотека для работы с ресурсами на macOS, iOS, Android, JVM и JS/Browser с поддержкой локализации.
	•	Compose Image Loader: библиотека для загрузки изображений в проектах Compose Multiplatform.

🚀 Прогресс проекта

✅ Завершено:

	•	Дизайн главного экрана.
	•	Экран деталей направления.
	•	Экран избранного.
	•	Загрузка изображений с использованием Coil.
	•	Нижнее меню навигации.
	•	Общие ресурсы (изображения, строки, шрифты).
	•	Навигация с использованием Voyager.
	•	Дизайн экрана корзины.
	•	CI/CD для генерации артефактов под iOS, Android, macOS, Windows.
	•	Публикация веб-приложения на GitHub Pages.

🚧 В работе:

	•	Дизайн экрана профиля.
	•	Настройка базы данных Room для добавления в избранное.
	•	Переключение темы (тёмная/светлая).
	•	Погода.
 	•	Навигация.

📂 Структура проекта

Проект состоит из двух модулей:

	1.	composeApp: модуль, содержащий общую UI/логику для приложений Android и iOS.
		•	Основной @Composable-функцией приложения является App, находящаяся в composeApp/src/commonMain/kotlin/App.kt.
		•	В этом модуле используются Gradle и Jetpack Compose Multiplatform.
 
	2.	iosApp: xcode-проект, который собирает iOS-приложение и использует общий модуль как зависимость через CocoaPods.


🖥️ Поддерживаемые платформы

	•	Android
	•	iOS
	•	macOS
	•	Windows

📜 Авторы

	•	Поливаев Дмитрий
 	•	Доронин Никита
  	•	Овсепян Агаси
