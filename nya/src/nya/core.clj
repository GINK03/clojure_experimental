(ns nya.core
  (:gen-class)
  (:require [postal.core :as postal])
)

(defn add[x y](+ x y))

(defn frac[x](if(= x 0) 1 (* x (frac(- x 1))))10)

(map (fn[x](+ x 1)) `(1 2 3))
(import '(java.util Random Locale))
;(import '(com.google.gson Gson))
;(import '(com.google.gson.reflect TypeToken))
(comment def (gson .Gson) )

(defn sender[x](postal/send-message ^{ :host "smtp.gmail.com"
                                :user "angeldust03"
                                :pass "catindog"
                                :ssl :yes!!!11}
                           {  :from "angeldust03@gmail.com"
                              :to "koji.suzuki.cc@gmail.com"
                              :subject "Hi!"
                              :body "Test."})
)

(defn loopDo[x y](+ x y) )

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (
    println "hoge" (add 10 20) (loopDo 0 10) (sender 0)
  )


)

