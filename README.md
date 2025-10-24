
# 🚀 Android Development Journey: Advanced Kotlin & Modular Compose E-Commerce

This repository serves as the official documentation of my professional Android Development journey. It showcases continuous progress, starting from fundamental Compose techniques to advanced topics like MVVM architecture, Coroutines, Generics, and clean code principles. This project is based on the knowledge acquired during the **Meta Android Developer Professional Certificate** program.

## 🎯 Project Goal and Focus

The core goal is to build essential e-commerce features (Listing, Cart Management, User Login) while strictly adhering to **clean code (DRY)**, **type safety**, and **modular architecture** principles.

---

## 🛠️ Technology Stack and Advanced Kotlin Features

| Category | Features | Description |
| :--- | :--- | :--- |
| **Core Kotlin** | **Generics (Interfaces)** | Enables type-safe cart management for different item types (`Product`, `Coupon`) using the `CartItem<T>` generic interface. |
| **Functional Programming** | **HOFs, `Filter`, `Fold`, `Map`** | Used for elegant list creation, searching, filtering, and calculating cart totals. |
| **Android & Compose** | **Extension Functions, HOF** | Implements type-safe navigation (`MapsTo...`) and manages user actions (`doActionAndNavigate`). |
| **Architecture** | **Modular Package Structure** | Organizes code into distinct layers: `domain.manager`, `features`, `core.utils`, and `ui` packages. |

## 📈 Learning Objectives and Evolution Matrix (V1.0 to V2.0)

This section details the specific skills targeted in the initial version and how they were advanced and refined in the current version (V2.0).

| Feature / Objective | Initial Focus (V1.0) | Advanced Application (V2.0) |
| :--- | :--- | :--- |
| **Navigation** | Implementing basic `NavHost` and `NavController`. | **Tip-Safe Navigasyon:** Rota Sabitleri ve **Extension Functions** (`MapsTo...`). |
| **Kotlin Syntax** | Basic variable/function usage. | **Advanced HOFs:** Custom **Higher-Order Functions** (`doActionAndNavigate`) ve **`map`** ile dinamik liste oluşturma. |
| **Lists & Data** | Basic `LazyColumn` usage for data display. | **Functional Collections:** Using **`Filter`** for dynamic searching and **`Fold`** for summary calculations. |
| **UI Components** | Using core elements (`Column`, `Card`, `Row`). | **Extension Functions:** Standardized card styling (`standartClickableCardStyle`). |
| **State Management** | Using `mutableStateOf` for local state. | **Generics & Interfaces:** Jenerik **`CartItem<T>`** ile farklı tipteki verilerin (`Product` vs. `Coupon`) merkezi yönetimi. |
| **Architecture** | Flat file structure. | **Modular Structure:** Code separation into `domain.manager`, `features`, and `core.utils` packages. |

## 🔄 Development History and Timeline

The core refactoring and feature integration for this version (V2.0) were completed between **22.10.2025** and **24.10.2025**.

**Note on Initial Version:** The very first version of this project, which focused purely on basic Compose practice, is available on my profile at **[LearningComposeApp](https://github.com/berat-karabuga/LearningComposeApp)** for comparison.

---

## 🧪 Testing and Demo Credentials

To test the application locally, please use the following credentials:

| Feature | Usage | Value |
| :--- | :--- | :--- |
| **Login** | Username | `test` |
| **Login** | Password | `0000` |
| **Coupon Input** | Kupon Code | `TEST0000` |

---
---

## 🇹🇷 Türkçe Versiyon

# 🚀 Android Geliştirme Yolculuğu: İleri Kotlin ve Modüler Compose E-Ticaret

Bu depo, Android geliştirme yolculuğumu belgeleyen ve ileri düzey teknikleri uyguladığım, **Jetpack Compose** tabanlı bir e-ticaret uygulamasını barındırır. Proje, **Meta Android Developer Professional Certificate** programı boyunca edindiğim bilgileri uygulamaya dökme sürecimi göstermektedir.

## 🎯 Projenin Amacı ve Odak Noktası

Temel amaç, **temiz kod**, **tip güvenliği** ve **modüler mimari** ilkelerini uygulayarak bir e-ticaret uygulamasının temel özelliklerini oluşturmaktır.

---

## 🛠️ Kullanılan Teknolojiler ve İleri Kotlin Özellikleri

| Başlık | Özellikler | Açıklama |
| :--- | :--- | :--- |
| **Kotlin İleri Düzey** | **Generics (Jenerikler)** | Farklı tipteki öğelerin (`Product`, `Coupon`) tek bir jenerik arayüz (`CartItem<T>`) ile sepet yönetimini sağlar. |
| **Fonksiyonel Programlama** | **HOF'lar, `Filter`, `Fold`, `Map`** | Liste oluşturma, arama, sepet toplamı gibi işlemlerin daha kısa ve zarif bir şekilde yapılması. |
| **Android & Compose** | **Extension Functions, HOF** | Navigasyonu (`MapsTo...`) ve buton tıklamalarını (`doActionAndNavigate`) tip güvenli hale getirir. |
| **Mimari & Düzen** | **Modüler Paket Yapısı** | Kodun `features`, `domain.manager`, `core.utils` ve `ui` gibi mantıksal katmanlara ayrılması. |

## 📈 Öğrenim Hedefleri ve Gelişim Matrisi (V1.0'dan V2.0'a)

Bu bölüm, başlangıç versiyonunda hedeflenen becerileri ve bunların güncel versiyonda (V2.0) nasıl ileri seviyeye taşındığını detaylandırır.

| Özellik / Hedef | Başlangıç Odak Noktası (V1.0) | İleri Seviye Uygulama (V2.0) |
| :--- | :--- | :--- |
| **Navigasyon** | Temel `NavHost` ve `NavController` uygulaması. | **Tip-Güvenli Navigasyon:** Rota Sabitleri ve **Uzantı Fonksiyonları** (`MapsTo...`). |
| **Kotlin Sözdizimi** | Temel değişken/fonksiyon kullanımı. | **İleri Düzey HOF'lar:** Özel **Yüksek Mertebeden Fonksiyonlar** (`doActionAndNavigate`) ve **`map`** ile dinamik liste oluşturma. |
| **Liste & Veri** | Veri göstermek için temel `LazyColumn` kullanımı. | **Fonksiyonel Koleksiyonlar:** Arama için **`Filter`** ve özet hesaplamalar için **`Fold`** kullanımı. |
| **Kullanıcı Arayüzü** | Çekirdek öğelerin (`Column`, `Card`) kullanımı. | **Uzantı Fonksiyonları:** Kart stillerinin standartlaştırılması (`standartClickableCardStyle`). |
| **Durum Yönetimi** | `mutableStateOf` ile yerel durum yönetimi. | **Jenerikler ve Arayüzler:** Jenerik **`CartItem<T>`** ile farklı tipteki verilerin (`Product` vs. `Coupon`) merkezi yönetimi. |
| **Mimari** | Düz dosya yapısı. | **Modüler Yapı:** Kodun `domain.manager`, `features` ve `core.utils` paketlerine ayrılması. |

## 🛠️ Teknoloji ve İleri Düzey Özellikler

Son versiyon aşağıdaki temel teknolojilerden yararlanmaktadır:

* **Android & Kullanıcı Arayüzü:** Jetpack Compose, Material Design 3.
* **Çekirdek Kotlin:** Jenerikler, Fonksiyonel Programlama, Uzantı Fonksiyonları.
* **Mimari:** Modüler Tasarım, Alan/Özellik Ayrımı.

### Geliştirme Zaman Çizelgesi

Bu versiyonun temel Refactoring ve özellik entegrasyonu **22.10.2025** ve **24.10.2025** tarihleri arasında tamamlanmıştır.

**İlk Versiyon Notu:** Projenin sadece temel Compose pratiğine odaklanan **ilk versiyonu** ve tüm geçmişi, profilimdeki **[LearningComposeApp](https://github.com/berat-karabuga/LearningComposeApp)** deposunda karşılaştırma amacıyla mevcuttur.

---

## 🧪 Test Bilgileri

Uygulamayı yerel olarak test etmek isteyenler için kimlik bilgileri ve kupon kodu aşağıdadır:

| Özellik | Kullanım | Değer |
| :--- | :--- | :--- |
| **Giriş (Login)** | Kullanıcı Adı | `test` |
| **Giriş (Login)** | Şifre | `0000` |
| **Kupon Girişi** | Kupon Kodu | `TEST0000` |

---
