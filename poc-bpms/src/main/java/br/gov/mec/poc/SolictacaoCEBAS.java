package br.gov.mec.poc;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class SolictacaoCEBAS implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Solicitante")
   private br.gov.mec.poc.Solicitante solicitante;
   @org.kie.api.definition.type.Label(value = "Data da Solicita\u00E7\u00E3o")
   private java.util.Date dataSolicitacao;

   public SolictacaoCEBAS()
   {
   }

   public br.gov.mec.poc.Solicitante getSolicitante()
   {
      return this.solicitante;
   }

   public void setSolicitante(br.gov.mec.poc.Solicitante solicitante)
   {
      this.solicitante = solicitante;
   }

   public java.util.Date getDataSolicitacao()
   {
      return this.dataSolicitacao;
   }

   public void setDataSolicitacao(java.util.Date dataSolicitacao)
   {
      this.dataSolicitacao = dataSolicitacao;
   }

   public SolictacaoCEBAS(br.gov.mec.poc.Solicitante solicitante,
         java.util.Date dataSolicitacao)
   {
      this.solicitante = solicitante;
      this.dataSolicitacao = dataSolicitacao;
   }

}