Travel App (Kotlin Multiplatform Mobile)

Travel App — это простое мобильное приложение, демонстрирующее использование Kotlin Multiplatform Mobile для разработки приложений под Android и iOS с использованием Jetpack Compose 🚀.

📱 Предпросмотр
![765434567654](https://github.com/user-attachments/assets/0349ce19-41cd-427c-9b71-ef0d38ebbb7c)

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

🔧 Установка и запуск

	1.	Ознакомьтесь с разделом “Setting up environment” для настройки окружения.
	2.	Клонируйте репозиторий.
	3.	Откройте проект в Android Studio Electric Eel или более новой версии.
	4.	Соберите проект 🔨 и убедитесь, что всё работает корректно.
	5.	Запустите приложение:
		•	Для Android выберите конфигурацию androidApp.
		•	Для iOS выберите конфигурацию iosApp или используйте Xcode.
  		•	ПК:
    		
<img width="868" alt="image" src="https://github.com/user-attachments/assets/1d00405a-ce3f-4b40-a9b9-5580671b355c" />
		
<img width="464" alt="image" src="https://github.com/user-attachments/assets/5e27c7c3-8c31-4001-9ed4-d8cb345e614c" />

 
🖥️ Поддерживаемые платформы

	•	Android
	•	iOS
	•	macOS
	•	Windows

📜 Авторы

	•	Поливаев Дмитрий
 	•	Доронин Никита
  	•	Овсепян Агаси
