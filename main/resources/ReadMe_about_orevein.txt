#### About orevein config file ####

コンフィグフォルダにあるorevein.jsonに追加することで、鉱脈に生成される鉱石の種類を増やすことが出来ます。

*書式
サンプルの書式を参考に、

"鉱脈のタイプ名"{
    "modid:blockの登録名:メタ値" : ウェイト値,
    "modid:blockの登録名:メタ値" : ウェイト値
},
"鉱脈のタイプ名"{
    "modid:blockの登録名:メタ値" : ウェイト値,
    "modid:blockの登録名:メタ値" : ウェイト値 ,
    ...
},
...

というように追記していってください。
ブロックの登録名は、別途調べる必要があります。


*各鉱脈のタイプ名
赤(山岳・乾燥地帯):red
赤(高山帯):high_red
青(海・湿地・寒冷地):blue
緑(森林):green
白(平原・サバンナ):white
黒(地底):black
ネザー(ネザー):nether
浜辺のグアノ脈:guano
スカルン中層:skarn
スカルン下層:skarn_under


*ウェイト値について
主な鉱石はウエイト値が10～30程度に設定されています。
これより大きくなると生成率が大きくなり、小さくすれば生成率も小さくなります。


*より細かい調整を行うためには、APIを利用して、アドオンや連携要素として改変する必要があります。
-輝蒼鉛鉱のように、低確率で置き換わるレア鉱石
-生成テーブルの置き換え、テーブルからの鉱石の削除

このコンフィグでできるのは、鉱石の追加のみです。
