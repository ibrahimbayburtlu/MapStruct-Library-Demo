# MapStruct Kütüphanesi Demo Projesi

Bu proje, Java dilinde MapStruct kütüphanesinin kullanımını göstermek için hazırlanmıştır. MapStruct, farklı tipler arasında veri dönüşümlerini otomatikleştirmek için kullanılan bir nesne eşleme çerçevesidir.

## Proje Hakkında

Bu demo projesi, MapStruct'in temel kullanımını ve faydalarını anlamak için basit bir örnek içerir. Proje, bir müşteri verisini temsil eden Customer sınıfı ile bu veriyi aktarmak için kullanılan CustomerDTO sınıfı arasında dönüşümleri gerçekleştirmeyi hedefler.

## Proje Yapısı

Proje yapısı aşağıdaki gibi oluşturulmuştur:

- `src/main/java/com/example/mapstructdemo/model`: Customer ve CustomerDTO sınıflarının tanımlandığı paket
- `src/main/java/com/example/mapstructdemo/mapper`: MapStruct tarafından otomatik olarak üretilen mapper arayüzünün bulunduğu paket
- `src/main/java/com/example/mapstructdemo/service`: Dönüşüm işlemlerinin gerçekleştirildiği servis sınıfının bulunduğu paket

## Gereksinimler

- Java 8 veya daha yeni bir sürüm
- Maven veya Gradle gibi bir bağımlılık yöneticisi

## Kullanım

1. Projeyi klonlayın:

```bash
git clone https://github.com/your-username/MapStruct-Library-Demo.git
