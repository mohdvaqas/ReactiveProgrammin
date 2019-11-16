package com.practice.ReactiveProgramming;

import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

public class ReactiveProgrammingApplication {

	public static void main(String[] args) {

		Observable<String> observable = Observable.just("Vaqas Azeem");
		observable.subscribe(System.out::println);

	}

}
