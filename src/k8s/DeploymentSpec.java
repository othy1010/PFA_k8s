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
public interface DeploymentSpec extends SpecFactory {
	/**
	 * Returns the value of the '<em><b>Selector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selector</em>' reference.
	 * @see #setSelector(Selector)
	 * @see k8s.K8sPackage#getDeploymentSpec_Selector()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Selector getSelector();

	/**
	 * Sets the value of the '{@link k8s.DeploymentSpec#getSelector <em>Selector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' reference.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(Selector value);

	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' reference.
	 * @see #setStrategy(DeploymentStrategy)
	 * @see k8s.K8sPackage#getDeploymentSpec_Strategy()
	 * @model required="true" transient="true"
	 * @generated
	 */
	DeploymentStrategy getStrategy();

	/**
	 * Sets the value of the '{@link k8s.DeploymentSpec#getStrategy <em>Strategy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' reference.
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(DeploymentStrategy value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' reference.
	 * @see #setTemplate(PodTemplate)
	 * @see k8s.K8sPackage#getDeploymentSpec_Template()
	 * @model required="true" transient="true"
	 * @generated
	 */
	PodTemplate getTemplate();

	/**
	 * Sets the value of the '{@link k8s.DeploymentSpec#getTemplate <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(PodTemplate value);

} // DeploymentSpec
