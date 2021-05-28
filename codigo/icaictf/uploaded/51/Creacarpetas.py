# Programa para crear carpetas automaticamente

import os 


CD_init = int(input("Introduzca el CD de inicio (siempre el 1º de un libro): "))
libro_fin = int(input("Introduzca el libro de fin: "))
libro_init = int(input("Introduzca el libro de inicio: "))

localizacion = os.getcwd()

CD = CD_init

for Num_lib in xrange(Libro_init,libro_fin):

	for Num_sek in xrange(1,3):
		

		nom_carpeta = str(localizacion)+"CD-"str(CD)+" - Buch - "+str(Num_lib)+" Sektion - "+str(Num_sek)
		nom_carpeta_ext = nom_carpeta+"/Audio CD"
		os.mkdir(nom_carpeta)
		os.mkdir(nom_carpeta_ext)

		CD = CD + 1 

	pass