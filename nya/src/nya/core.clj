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

<<<<<<< HEAD
(defn sender[x y](postal/send-message ^{ :host "smtp.muumuu-mail.com"
                                :user "1@cuttysark.jp.net"
                                :pass y
=======
(defn sender[x](postal/send-message ^{ :host "smtp.gmail.com"
                                :user "angeldust03"
                                :pass "*****"
>>>>>>> dfa102f9a3ab57a088e56bbbd7e31b58b9633bf3
                                :ssl :yes!!!11}
                           {  :from "1@cuttysark.jp.net"
                              :to "angeldust03@gmail.com"
                              :subject "this is test"
                              :body "Test."})
)

(defn forMacro[_x _y]( for[x (range _x)](sender x _y) ) )

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (
    println "hoge" (first args) (add 10 20) (forMacro 1 (first args) )
    ;(sender 0)
  )


)

