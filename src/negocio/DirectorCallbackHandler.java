
/**
 * DirectorCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package negocio;

    /**
     *  DirectorCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class DirectorCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public DirectorCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public DirectorCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for obtenerMedicos method
            * override this method for handling normal response from obtenerMedicos operation
            */
           public void receiveResultobtenerMedicos(
                    negocio.DirectorStub.ObtenerMedicosResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerMedicos operation
           */
            public void receiveErrorobtenerMedicos(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerPorcentajeOcupacionBox method
            * override this method for handling normal response from obtenerPorcentajeOcupacionBox operation
            */
           public void receiveResultobtenerPorcentajeOcupacionBox(
                    negocio.DirectorStub.ObtenerPorcentajeOcupacionBoxResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerPorcentajeOcupacionBox operation
           */
            public void receiveErrorobtenerPorcentajeOcupacionBox(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerPacientesMasAtendidos method
            * override this method for handling normal response from obtenerPacientesMasAtendidos operation
            */
           public void receiveResultobtenerPacientesMasAtendidos(
                    negocio.DirectorStub.ObtenerPacientesMasAtendidosResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerPacientesMasAtendidos operation
           */
            public void receiveErrorobtenerPacientesMasAtendidos(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerBoxs method
            * override this method for handling normal response from obtenerBoxs operation
            */
           public void receiveResultobtenerBoxs(
                    negocio.DirectorStub.ObtenerBoxsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerBoxs operation
           */
            public void receiveErrorobtenerBoxs(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerMedicosMasSolicitados method
            * override this method for handling normal response from obtenerMedicosMasSolicitados operation
            */
           public void receiveResultobtenerMedicosMasSolicitados(
                    negocio.DirectorStub.ObtenerMedicosMasSolicitadosResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerMedicosMasSolicitados operation
           */
            public void receiveErrorobtenerMedicosMasSolicitados(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerPorcentajeOcupacionMedico method
            * override this method for handling normal response from obtenerPorcentajeOcupacionMedico operation
            */
           public void receiveResultobtenerPorcentajeOcupacionMedico(
                    negocio.DirectorStub.ObtenerPorcentajeOcupacionMedicoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerPorcentajeOcupacionMedico operation
           */
            public void receiveErrorobtenerPorcentajeOcupacionMedico(java.lang.Exception e) {
            }
                


    }
    