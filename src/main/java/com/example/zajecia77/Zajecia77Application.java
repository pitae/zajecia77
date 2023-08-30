package com.example.zajecia77;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Zajecia77Application {

	public static void main(String[] args) {
		SpringApplication.run(Zajecia77Application.class, args);



//		Opis:
//		Twoim zadaniem jest stworzenie systemu zarządzania zadaniami. System ma obsługiwać zadania różnych użytkowników,
//		którzy mogą być albo twórcami zadań, albo przypisanymi użytkownikami do zadań. Każde zadanie ma opis, datę utworzenia,
//		termin wykonania i status (np. "do zrobienia", "w trakcie", "zakończone").
//
//				Wymagania:
//
//		Stwórz projekt Spring Boot z wykorzystaniem Maven lub Gradle.
//				Skonfiguruj bazę danych MySQL i wykorzystaj Liquibase do zarządzania migracjami schematu bazy danych.
//				Zaimplementuj encje:
//		User z polami: ID, nazwa użytkownika, hasło (zakodowane), rola (użytkownik lub twórca zadań).
//				Task z polami: ID, opis, data utworzenia, termin wykonania, status.
//				Stwórz relacje obiektowe pomiędzy encjami:
//		Każde zadanie (Task) ma twórcę (User) i może mieć przypisanych użytkowników do wykonania.
//				Użytkownik (User) może być przypisany do wielu zadań.
//		Skonfiguruj Spring Security w celu uwierzytelniania i autoryzacji użytkowników:
//		Utwórz konfigurację bezpieczeństwa, która pozwoli na dostęp do różnych funkcjonalności w zależności od roli użytkownika.
//				Skonfiguruj formularz logowania oraz wylogowywania.
//		Stwórz kontrolery do obsługi zadań:
//		TaskController z endpointami do tworzenia, edytowania, usuwania i przeglądania zadań.
//				Stwórz testy integracyjne przy użyciu JUnit i narzędzia do testowania HTTP (np. RestTemplate lub WebTestClient):
//		Przetestuj endpointy kontrolera z uwzględnieniem różnych przypadków użycia, uwierzytelniania i autoryzacji.
//		Zaimplementuj obsługę błędów i zwracanie odpowiednich kodów odpowiedzi HTTP w zależności od sytuacji
//		(np. nieautoryzowany dostęp, brak zasobu).
//				Utwórz prosty interfejs użytkownika (może to być np. prosta strona HTML lub wykorzystanie narzędzi
//				do tworzenia interfejsu, takich jak React czy Thymeleaf) umożliwiający użytkownikom logowanie,
//				przeglądanie i zarządzanie ich zadaniami w zależności od ich ról.
//				Dodatkowe wyzwania (opcjonalne):
//
//		Dodaj możliwość sortowania i filtrowania zadań.
//		Implementuj mechanizm powiadomień dla użytkowników o zbliżającym się terminie wykonania zadania.
//				Utwórz możliwość przypisywania priorytetów zadaniom.
//		Zaimplementuj możliwość załączania plików do zadań.
	}

}
