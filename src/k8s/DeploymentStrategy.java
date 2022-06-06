/**
 */
package k8s;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link k8s.DeploymentStrategy#getType <em>Type</em>}</li>
 *   <li>{@link k8s.DeploymentStrategy#getRollingUpdate <em>Rolling Update</em>}</li>
 * </ul>
 *
 * @see k8s.K8sPackage#getDeploymentStrategy()
 * @model
 * @generated
 */
public interface DeploymentStrategy extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see k8s.K8sPackage#getDeploymentStrategy_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link k8s.DeploymentStrategy#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Rolling Update</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rolling Update</em>' reference.
	 * @see #setRollingUpdate(RollingUpdateDeployment)
	 * @see k8s.K8sPackage#getDeploymentStrategy_RollingUpdate()
	 * @model required="true"
	 * @generated
	 */
	RollingUpdateDeployment getRollingUpdate();

	/**
	 * Sets the value of the '{@link k8s.DeploymentStrategy#getRollingUpdate <em>Rolling Update</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rolling Update</em>' reference.
	 * @see #getRollingUpdate()
	 * @generated
	 */
	void setRollingUpdate(RollingUpdateDeployment value);

} // DeploymentStrategy
