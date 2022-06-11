/**
 */
package k8s;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link k8s.DeploymentSpec#getSelector <em>Selector</em>}</li>
 *   <li>{@link k8s.DeploymentSpec#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link k8s.DeploymentSpec#getTemplate <em>Template</em>}</li>
 * </ul>
 *
 * @see k8s.K8sPackage#getDeploymentSpec()
 * @model
 * @generated
 */
public interface DeploymentSpec extends Spec {
	/**
	 * Returns the value of the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selector</em>' containment reference.
	 * @see #setSelector(Selector)
	 * @see k8s.K8sPackage#getDeploymentSpec_Selector()
	 * @model containment="true"
	 * @generated
	 */
	Selector getSelector();

	/**
	 * Sets the value of the '{@link k8s.DeploymentSpec#getSelector <em>Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' containment reference.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(Selector value);

	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' containment reference.
	 * @see #setStrategy(DeploymentStrategy)
	 * @see k8s.K8sPackage#getDeploymentSpec_Strategy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DeploymentStrategy getStrategy();

	/**
	 * Sets the value of the '{@link k8s.DeploymentSpec#getStrategy <em>Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' containment reference.
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(DeploymentStrategy value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' containment reference.
	 * @see #setTemplate(PodTemplate)
	 * @see k8s.K8sPackage#getDeploymentSpec_Template()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PodTemplate getTemplate();

	/**
	 * Sets the value of the '{@link k8s.DeploymentSpec#getTemplate <em>Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' containment reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(PodTemplate value);

} // DeploymentSpec
