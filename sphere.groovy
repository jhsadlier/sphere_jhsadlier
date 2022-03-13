//create a sphere
CSG sphere = new Sphere(25)// Spheres radius
				.toCSG()// convert to CSG to display
				
CSG sphereHighRes = new Sphere(55,// Spheres radius
						60,//elevation Divisions
						40)// vertical divisions
						.toCSG()// convert to CSG to display
sphere=sphere.movex(55)
return [sphere,sphereHighRes]