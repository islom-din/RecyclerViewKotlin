package islom.din.recyclerviewkotlin

import islom.din.recyclerviewkotlin.models.BlogPost

/*
*  Hard coded!!! No need to it in real application
*  This is just for an example
* */

class DataSource{

    companion object{

        fun createDataSet(): ArrayList<BlogPost>{
            val list = ArrayList<BlogPost>()
            list.add(
                BlogPost(
                    "Vikings",
                    "You made it to the end of the course!\r\n\r\nNext we'll be building the REST API!",
                    "https://s1.1zoom.me/big3/245/Warriors_Men_Vikings_(TV_437441.jpg",
                    "Islom"
                )
            )
            list.add(
                BlogPost(
                    "Stranger Things",
                    "The REST API course is complete. You can find the videos here: https://codingwithmitch.com/courses/build-a-rest-api/.",
                    "https://besthqwallpapers.com/Uploads/17-1-2019/77715/stranger-things-poster-season-3-2019-movie-tv-series.jpg",
                    "Jack"
                )
            )

            list.add(
                BlogPost(
                    "Hobbit",
                    "Justin has been producing online courses for YouTube, Udemy, and his website CodingForEntrepreneurs.com for over 5 years.",
                    "https://avatars.mds.yandex.net/get-pdb/1817329/0dbede87-ca34-4312-8f6e-4134d167bda4/s1200?webp=false",
                    "John"
                )
            )
            list.add(
                BlogPost(
                    "Freelance Android Developer (Vasiliy Zukanov)",
                    "Vasiliy has been a freelance android developer for several years. He also has some of the best android development courses I've had the pleasure of taking on Udemy.com.",
                    "https://gazeta.a42.ru/uploads/3a2/3a2da8e0-7a0b-11e9-9c95-5fc8d38e3f1a.jpg",
                    "Steven"
                )
            )
            list.add(
                BlogPost(
                    "His dark materials",
                    "Freelancing as an Android developer with Donn Felker.\\r\\n\\r\\nDonn is also:\\r\\n\\r\\n1) Founder of caster.io\\r\\n\\r\\n2) Co-host of the fragmented podcast (fragmentedpodcast.com).",
                    "https://pbs.twimg.com/media/ENAy_pQWsAAMtTP.jpg",
                    "Richelle"
                )
            )
            list.add(
                BlogPost(
                    "Fast and Furious",
                    "What kind of hobbies do software developers have? It sounds like many software developers don't have a lot of hobbies and choose to focus on work. Is that a good idea?",
                    "https://s2.best-wallpaper.net/wallpaper/1920x1080/1504/Fast-and-Furious-7-HD_1920x1080.jpg",
                    "Jessica"
                )
            )
            list.add(
                BlogPost(
                    "Harry Potter and the orden of the Phonix",
                    "In this podcast I interviewed the Fullsnack Developer (AKA Nicholas Olsen).\\r\\n\\r\\nNicholas is many things. What I mean by that is, he's good at many things.\\r\\n\\r\\n1. He’s an entrepreneur\\r\\n\\r\\n2. Web developer\\r\\n\\r\\n3. Artist\\r\\n\\r\\n4. Graphic designer\\r\\n\\r\\n5. Musician (drums)\\r\\n\\r\\n6. Professional BodyBuilder.",
                    "https://i.sunhome.ru/journal/242/druzya-garri-pottera.orig.jpg",
                    "Rachel"
                )
            )
            list.add(
                BlogPost(
                    "Lord of the Rings",
                    "Interviewing a web developer, javascript expert, entrepreneur, freelancer, podcaster, and much more.",
                    "https://www.tokkoro.com/picsup/5690910-lord-rings-fellowship-ring-wallpapers.jpg",
                    "Olivia"
                )
            )
            list.add(
                BlogPost(
                    "Fringe. Possibility is everything",
                    "Kaushik Gopal is a Senior Android Engineer working in Silicon Valley.\r\n\r\nHe works as a Senior Staff engineer at Instacart.\r\n\r\nInstacart: https://www.instacart.com/",
                    "https://get.wallhere.com/photo/TV-Fringe-TV-series-ART-performance-art-212724.jpg",
                    "Dean"
                )
            )
            return list
        }
    }
}