

/**
 * PacienteTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package negocio;

    /*
     *  PacienteTest Junit test case
    */

    public class PacienteTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testreservarHoraAps() throws java.lang.Exception{

        negocio.PacienteStub stub =
                    new negocio.PacienteStub();//the default implementation should point to the right endpoint

           negocio.PacienteStub.ReservarHoraAps reservarHoraAps16=
                                                        (negocio.PacienteStub.ReservarHoraAps)getTestObject(negocio.PacienteStub.ReservarHoraAps.class);
                    // TODO : Fill in the reservarHoraAps16 here
                
                        assertNotNull(stub.reservarHoraAps(
                        reservarHoraAps16));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartreservarHoraAps() throws java.lang.Exception{
            negocio.PacienteStub stub = new negocio.PacienteStub();
             negocio.PacienteStub.ReservarHoraAps reservarHoraAps16=
                                                        (negocio.PacienteStub.ReservarHoraAps)getTestObject(negocio.PacienteStub.ReservarHoraAps.class);
                    // TODO : Fill in the reservarHoraAps16 here
                

                stub.startreservarHoraAps(
                         reservarHoraAps16,
                    new tempCallbackN65548()
                );
              


        }

        private class tempCallbackN65548  extends negocio.PacienteCallbackHandler{
            public tempCallbackN65548(){ super(null);}

            public void receiveResultreservarHoraAps(
                         negocio.PacienteStub.ReservarHoraApsResponse result
                            ) {
                
            }

            public void receiveErrorreservarHoraAps(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testobtenerMedicosDeUnaEspecialidad() throws java.lang.Exception{

        negocio.PacienteStub stub =
                    new negocio.PacienteStub();//the default implementation should point to the right endpoint

           negocio.PacienteStub.ObtenerMedicosDeUnaEspecialidad obtenerMedicosDeUnaEspecialidad18=
                                                        (negocio.PacienteStub.ObtenerMedicosDeUnaEspecialidad)getTestObject(negocio.PacienteStub.ObtenerMedicosDeUnaEspecialidad.class);
                    // TODO : Fill in the obtenerMedicosDeUnaEspecialidad18 here
                
                        assertNotNull(stub.obtenerMedicosDeUnaEspecialidad(
                        obtenerMedicosDeUnaEspecialidad18));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartobtenerMedicosDeUnaEspecialidad() throws java.lang.Exception{
            negocio.PacienteStub stub = new negocio.PacienteStub();
             negocio.PacienteStub.ObtenerMedicosDeUnaEspecialidad obtenerMedicosDeUnaEspecialidad18=
                                                        (negocio.PacienteStub.ObtenerMedicosDeUnaEspecialidad)getTestObject(negocio.PacienteStub.ObtenerMedicosDeUnaEspecialidad.class);
                    // TODO : Fill in the obtenerMedicosDeUnaEspecialidad18 here
                

                stub.startobtenerMedicosDeUnaEspecialidad(
                         obtenerMedicosDeUnaEspecialidad18,
                    new tempCallbackN65589()
                );
              


        }

        private class tempCallbackN65589  extends negocio.PacienteCallbackHandler{
            public tempCallbackN65589(){ super(null);}

            public void receiveResultobtenerMedicosDeUnaEspecialidad(
                         negocio.PacienteStub.ObtenerMedicosDeUnaEspecialidadResponse result
                            ) {
                
            }

            public void receiveErrorobtenerMedicosDeUnaEspecialidad(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testbuscarHoraAps() throws java.lang.Exception{

        negocio.PacienteStub stub =
                    new negocio.PacienteStub();//the default implementation should point to the right endpoint

           negocio.PacienteStub.BuscarHoraAps buscarHoraAps20=
                                                        (negocio.PacienteStub.BuscarHoraAps)getTestObject(negocio.PacienteStub.BuscarHoraAps.class);
                    // TODO : Fill in the buscarHoraAps20 here
                
                        assertNotNull(stub.buscarHoraAps(
                        buscarHoraAps20));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartbuscarHoraAps() throws java.lang.Exception{
            negocio.PacienteStub stub = new negocio.PacienteStub();
             negocio.PacienteStub.BuscarHoraAps buscarHoraAps20=
                                                        (negocio.PacienteStub.BuscarHoraAps)getTestObject(negocio.PacienteStub.BuscarHoraAps.class);
                    // TODO : Fill in the buscarHoraAps20 here
                

                stub.startbuscarHoraAps(
                         buscarHoraAps20,
                    new tempCallbackN65630()
                );
              


        }

        private class tempCallbackN65630  extends negocio.PacienteCallbackHandler{
            public tempCallbackN65630(){ super(null);}

            public void receiveResultbuscarHoraAps(
                         negocio.PacienteStub.BuscarHoraApsResponse result
                            ) {
                
            }

            public void receiveErrorbuscarHoraAps(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testobtenerEspecialidad() throws java.lang.Exception{

        negocio.PacienteStub stub =
                    new negocio.PacienteStub();//the default implementation should point to the right endpoint

           negocio.PacienteStub.ObtenerEspecialidad obtenerEspecialidad22=
                                                        (negocio.PacienteStub.ObtenerEspecialidad)getTestObject(negocio.PacienteStub.ObtenerEspecialidad.class);
                    // TODO : Fill in the obtenerEspecialidad22 here
                
                        assertNotNull(stub.obtenerEspecialidad(
                        obtenerEspecialidad22));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartobtenerEspecialidad() throws java.lang.Exception{
            negocio.PacienteStub stub = new negocio.PacienteStub();
             negocio.PacienteStub.ObtenerEspecialidad obtenerEspecialidad22=
                                                        (negocio.PacienteStub.ObtenerEspecialidad)getTestObject(negocio.PacienteStub.ObtenerEspecialidad.class);
                    // TODO : Fill in the obtenerEspecialidad22 here
                

                stub.startobtenerEspecialidad(
                         obtenerEspecialidad22,
                    new tempCallbackN65671()
                );
              


        }

        private class tempCallbackN65671  extends negocio.PacienteCallbackHandler{
            public tempCallbackN65671(){ super(null);}

            public void receiveResultobtenerEspecialidad(
                         negocio.PacienteStub.ObtenerEspecialidadResponse result
                            ) {
                
            }

            public void receiveErrorobtenerEspecialidad(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    