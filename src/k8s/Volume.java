/**
 */
package k8s;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link k8s.Volume#getName <em>Name</em>}</li>
 *   <li>{@link k8s.Volume#getHostPath <em>Host Path</em>}</li>
 * </ul>
 *
 * @see k8s.K8sPackage#getVolume()
 * @model
 * @generated
 */
public interface Volume extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see k8s.K8sPackage#getVolume_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link k8s.Volume#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Host Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Path</em>' reference.
	 * @see #setHostPath(HostPathVolumeSource)
	 * @see k8s.K8sPackage#getVolume_HostPath()
	 * @model required="true"
	 * @generated
	 */
	HostPathVolumeSource getHostPath();

	/**
	 * Sets the value of the '{@link k8s.Volume#getHostPath <em>Host Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Path</em>' reference.
	 * @see #getHostPath()
	 * @generated
	 */
	void setHostPath(HostPathVolumeSource value);

} // Volume
