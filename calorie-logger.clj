;succy boie says use java AWT for GUI


  ;heavy cream helper
  (defn cream-milk [milk]
    (println 
      "butter:" (/ milk 2.5) "mL;" 
      "milk:" milk "mL"))

  (defn cream-butter [butter]
    (println 
      "butter:" butter "mL;" 
      "milk:" (* butter 2.5) "mL"))

;necessary lib for (log)
(import java.util.Date)
(defn date [] (str (new java.util.Date)))

;cheeky math by succy boie
  ;prints float with 1 decimal place after int
;(defn round [n] (-> n (* 10) (Math/round) (/ 10) (float))) 

;main db functions
(def rate 
  {:tomato (float 22/123)
  :mushroom (float 5/23), :mushrooms (float 5/23)
  :onion (float 41/94)
  :milk-red (float 2/3), :red-milk (float 2/3)
  :shoyu (float 2/3)
  :tofu (float 14/17)
  :chx (float 11/5)
  :protein (float 15/4) 
  :oatmeal-gf (float 15/4)
  :oatmeal-raisin (float 135/34)  ;3.9
  :milk-blue (float 7/12), :blue-milk (float 7/12) ;0.22
  :granola-bar 100 ;0.22
  :peanut-bar 170
  :oj 0.5
  :acai 0.58
  :potato (float 55/74) ;0.7
  :garlic 1
  :banana (float 105/100)
  :lasagna (float 410/226)
  :mash 1.0499855083826222   ;1.1
  :strawberry-jam (float 35/18)
  :whole-egg 70, :egg-whole 70
  :egg 7/5, :eggs 7/5
  :bread (float 9/4) ;2
  :honey 20/7
  :cream 1.6288895396698493
  :pasta-green (float 95/28), :green-pasta (float 95/28)  ;3.3
  :rice (float 32/9)
  :tortilla-chips 5
  :peanut-butter (float 95/16)   ;5.93
  :mayo (float 100/15)
  :butter (float (/ 100 14.79))   ;6.7
  :big-butter (float 50/7)
  :oil 8
  :str-cheese 80, :cheesestick 80  :strchees 80 ;2.85
  :greek-yogurt (float 10/17), :greek (float 10/17)
  :tortilla 110  
  :oikos 100      ;0.66
  :yoplait 150
  :pepsi 150, :bepis 150
  :sea-chips (float 130/14), :seachips (float 130/14) 
  :spanakopita (float 200/85), :spk (float 200/85)
  :cocoa  (float 80/20)
  :panettone (float 270/83)
  :alfredo (float 70/62)
  :oatmeal-vanilla (float 280/63)
  :sweet-potato (float 103/114)
  :swiss-cheese (float 100/28), :swiss (float 100/28)
  :chewy-bar 150
  :chx-patty 250
  :cheerios (float 140/38)
  :pizza-roll (float 220/85)
  :fusilli (float 200/56)
  :protein-bar 190
  :activia 90
  :cottage-cheese (float 119/90), :cottage (float 119/90)
  :english-muffin 150
  :prunes (float 100/40), :prune (float 100/40)
  :dumpling (float 250/6)
  :pink-salmon 160
  :quinoa (float 180/45)
  :peanut-candy 70
  :taquito 125
  :cow-bar 100
  :hummus (float 80/28)
  :bischoff 75
  :conc 140
  :chobani 120
  :spicy-jelly (float 48/20)
  :olives (float 16/2)
    :olive (float 16/2)
  :tuna 180})

(def cals-new
  (fn
  ;1 item
  ([a b] (* a b))
  ;2 item
  ([a b, c d] 
      (-> (* a b) (+ (* c d))))
  ;3 item
  ([a b, c d, e f] 
      (apply + [(* a b) 
                (* c d) 
                (* e f)]))
  ;4 items
  ([a b, c d, e f, g h] 
      (apply + [(* a b) 
                (* c d) 
                (* e f)
                (* g h)]))
  ;5 items
  ([a b, c d, e f, g h, i j] 
      (apply + [(* a b) 
                (* c d) 
                (* e f)
                (* g h)
                (* i j)]))
  ;6 items
  ([a b, c d, e f, g h, i j, k l] 
      (apply + [(* a b) 
                (* c d) 
                (* e f)
                (* g h)
                (* i j)
                (* k l)]))
  ;7 items
  ([a b, c d, e f, g h, i j, k l, m n] 
      (apply + [(* a b) 
                (* c d) 
                (* e f)
                (* g h)
                (* i j)
                (* k l)
                (* m n)]))
  ;8 items
  ([a b, c d, e f, g h, i j, k l, m n, o p, q r] 
      (apply + [(* a b) 
                (* c d) 
                (* e f)
                (* g h)
                (* i j)
                (* k l)
                (* m n)
                (* o p)]))
  ;9 items
  ([a b, c d, e f, g h, i j, k l, m n, o p, q r, s t] 
      (apply + [(* a b) 
                (* c d) 
                (* e f)
                (* g h)
                (* i j)
                (* k l)
                (* m n)
                (* o p)
                (* q r)
                (* s t)]))))

(def cals
  (fn
  ;1 item
  ([a b] (-> (rate a) (* b)))
  ;2 item
  ([a b, c d] 
      (-> (rate a) (* b) 
          (+ (-> (rate c) (* d)))))
  ;3 item
  ([a b, c d, e f] 
      (apply + [(-> (rate a) (* b)) 
                (-> (rate c) (* d)) 
                (-> (rate e) (* f))]))
  ;4 items
  ([a b, c d, e f, g h] 
      (apply + [(-> (rate a) (* b)) 
                  (-> (rate c) (* d)) 
                  (-> (rate e) (* f))
                  (-> (rate g) (* h))]))
  ;5 items
  ([a b, c d, e f, g h, i j] 
      (apply + [(-> (rate a) (* b)) 
                  (-> (rate c) (* d)) 
                  (-> (rate e) (* f))
                  (-> (rate g) (* h))
                  (-> (rate i) (* j))]))
  ;6 items
  ([a b, c d, e f, g h, i j, k l] 
      (apply + [(-> (rate a) (* b)) 
                  (-> (rate c) (* d)) 
                  (-> (rate e) (* f))
                  (-> (rate g) (* h))
                  (-> (rate i) (* j))
                  (-> (rate k) (* l))]))
  ;7 items
  ([a b, c d, e f, g h, i j, k l, m n] 
      (apply + [(-> (rate a) (* b)) 
                  (-> (rate c) (* d)) 
                  (-> (rate e) (* f))
                  (-> (rate g) (* h))
                  (-> (rate i) (* j))
                  (-> (rate k) (* l))
                  (-> (rate m) (* n))]))
  ;8 items
  ([a b, c d, e f, g h, i j, k l, m n, o p, q r] 
      (apply + [(-> (rate a) (* b)) 
                  (-> (rate c) (* d)) 
                  (-> (rate e) (* f))
                  (-> (rate g) (* h))
                  (-> (rate i) (* j))
                  (-> (rate k) (* l))
                  (-> (rate m) (* n))
                  (-> (rate o) (* p))]))
  ;9 items
  ([a b, c d, e f, g h, i j, k l, m n, o p, q r, s t] 
      (apply + [(-> (rate a) (* b)) 
                  (-> (rate c) (* d)) 
                  (-> (rate e) (* f))
                  (-> (rate g) (* h))
                  (-> (rate i) (* j))
                  (-> (rate k) (* l))
                  (-> (rate m) (* n))
                  (-> (rate o) (* p))
                  (-> (rate q) (* r))
                  (-> (rate s) (* t))]))))

;output: Thu Nov 26 14:43:01 PST 2020 -- 42 cal.
(defn log [& more]      
  (apply println [\space\space (date) "--" (-> (apply + more) (int)) "cal."]))

(defn LOG [x]
  (log x))

(defn exep [name number]
  (do 
    (print "(log (cals ") 
    (print name) 
    (print ")) ")
    (println "")
    (println (date) "--" number "cal.")))


;make it round to nearest whole number -- (Math/ceil) & (Math/floor)
(defn calss [{:keys [rate]} grams]
(-> (* rate grams) (float) (Math/round)))

;; /usr/bin/clj conflict due to pprint
;; (defn foodmap [{:keys [name]}]
;;   (-> name (pprint)))

(defn togo [current-cals {:keys [rate]}]
  (-> (- 2400 current-cals) (/ rate) (Math/round) (println "grams")))

  (defn togo2 [current-cals {:keys [rate]}]
    (-> (- 2400 current-cals) (/ rate) (Math/round)))




;how many grams of each food left to go
; (defn togo [grams])
; (println (rice :name) "--" (round (/ grams (rice :rate))) "gram")

;need way to take multiple items and iterate (calss) over them
  ; fruits, vegetables, grains, protein, and dairy
(def foods  
  [(def tomato 
    {:name "tomato" 
    :rate (float 22/123) 
    :group "vegetable"})

  ;how do alias?
  (def mushroom 
    {:name "mushrooms" 
    :rate (float 5/23)
    :group 'vegetable})
  (def mushrooms mushroom)

  (def onion 
    {:name onion
    :rate (float 41/94)
    :group 'vegetable})

  (def milk-red 
    {:name "whole milk"
    :rate (float 2/3)
    :group 'diary})
  (def red-milk milk-red)

  (def milk-blue 
    {:name "2% milk"
    :rate (float 7/12)
    :group 'diary})
(def blue-milk milk-blue)

  (def rice
    {:name "long grain rice"
    :rate (float 32/9)
  ;   :serving 45 ;or 160 cal. ;attempt at gaining serving intake info 
    :group 'grain})

  (def oil 
    {:name "olive oil"
    :rate 8
    :group 'fat})

  (def shoyu
      {:name "soy sauce"
      :rate (float 2/3)
      :group 'salt})

  (def tofu
    {:name "tofu"
    :rate (float 14/17)
    :group 'protein})

  (def chx
    {:name "chicken"
    :rate (float 11/5)
    :group 'protein})

  (def protein
    {:name "protein powder"
    :rate (float 15/4)
    :group 'protein})

  (def oatmeal-gf
    {:name "oatmeal, gluten-free"
    :rate (float 15/4)
    :group 'grain})

  (def oatmeal-raisin
    {:name 'oatmeal-raisin
    :rate (float 135/34)
    :group 'grain})

  (def granola
    {:name "granola bar"
    :rate 100
    :group 'grain})

  (def oj
    {:name "Kirkland orange juice"
    :rate 0.5
    :group 'fruit})

  (def acai
    {:name "acai drink"
    :rate 100
    :group 'fruit})  

  (def potato
    {:name "red potato"
    :rate (float 55/74)
    :group 'vegtable})

  (def garlic
    {:name "garlic"
    :rate 1
    :group 'vegetable})

  (def lasagna
    {:name "Kirkland very american frozen lasagna"
    :rate (float 260/237)
    :group 'grain})

  (def mash
    {:name "mashed potatoes, boiled in cream and milk"
    :rate 1.0499855083826222
    :group 'vegtable})

  (def whole-egg
    {:name "an entire egg"
    :rate 70
    :group 'protein})

  (def egg
    {:name "some egg"
    :rate (float 7/5)
    :group 'protein})

  (def bread
    {:name "BFree gluten-free white bread"
    :rate (float 9/4)
    :group 'grain})

  (def honey
    {:name "Wild Mountain raw honey"
    :rate (float 20/7)
    :group 'sugar})

  (def cream
    {:name "homemade cream"
    :rate 1.6288895396698493
    :group 'dairy})

  (def green-pasta
    {:name "Explore Cuisine edamame and spirulina spaghetti"
    :rate (float 95/28)
    :group 'grain})
  (def pasta-green green-pasta)

  (def tortilla-chips
    {:name "First Street white corn tortilla chips"
    :rate 5
    :group 'grain})

  (def peanut-butter
    {:name "Skippy extra crunchy peanut butter"
    :rate (float 95/16)
    :group 'fat})
  (def pb peanut-butter)

  (def strawb-jam
    {:name "strawberry-jam"
    :rate (float 35/18)
    :group 'sugar})
  
  (def pbj
    {:name "peanut-butter & jelly sandwich"
    :rate (+ (calss bread 69) (calss pb 15) (calss strawb-jam 15))
    :group 'sugar})

  (def butter
    {:name "Kirkland salted sweet cream butter"
    :rate (float (/ 100 14.79))
    :group 'dairy})

  (def str-cheese
    {:name "Galbani string cheese"
    :rate 80
    :group 'dairy})
  (def cheesestick str-cheese)

  (def greek-yogurt
    {:name "Kirkland greek yogurt"
    :rate (float 10/17)
    :group 'dairy})
  (def greek greek-yogurt)

  (def tortilla
    {:name "Guerrero white corn tortillas"
    :rate 110
    :group 'grain})

  (def oikos
    {:name "Oikos yogurt"
    :rate 100
    :group 'dairy})

  (def yoplait
    {:name "Yoplait yogurt"
    :rate 150
    :group 'dairy})

  (def pepsi
    {:name "Pespi"
    :rate 150
    :group 'sugar})
  (def bepis pepsi)

(def banana
  {:name "banana"
  :rate (float 105/100)
  :group 'fruit})

(def sea-chips
  {:name "Miltons's crispy sea salt chips"
  :rate (float 130/14)
  :group 'grain})
  
(def cocoa
  {:name "Nestle red cocoa"
  :rate (float 80/20)
  :group 'sugar})

(def sweet-potato
  {:name "sweet potato"
  :rate (float 103/114)
  :group 'vegetable})])

  (defn togo 
    []
    (for 
      [list foods, 
      :let [rate (list :rate)]] 
    rate))

  ;; /usr/bin/clj conflict due to pprint
  ;; (defn togo 
  ;;   [current-cals]
  ;;   (for 
  ;;     [list foods, 
  ;;     :let [rate (list :rate)]
  ;;     :let [name (list :name)]]
  ;;   (-> (- 2400 current-cals) (/ rate ) (Math/round) (pprint))))

  ;; (defn togo 
  ;;   [current-cals]
  ;;   (for 
  ;;     [list foods, 
  ;;     :let [rate (list :rate)]
  ;;     :let [name (list :name)]]
  ;;   (-> (- 2400 current-cals) (/ rate ) (Math/round) (pprint))))

    (defn togoname []
      (for 
        [list foods,
        :let [name (list :name)]]
      (println name)))

(defn c2g
  "returns how many grams of specified food it takes to reach specified number of calories"
  [calories food]
  (/ calories (rate food)))