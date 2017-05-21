(ns forca.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
)

(def total-de-vidas 6)
(defn perdeu [] (print "Você perdeu!"))
(defn ganhou [] (print "Você ganhou!"))

(defn jogo [vidas palavra acertos]
  (if (= vidas 0)
    (perdeu)
    (do 
      (print vidas)
      (jogo (dec vidas))
    )
  )
)
