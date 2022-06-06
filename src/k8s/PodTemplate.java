/**
 */
package k8s;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pod Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link k8s.PodTemplate#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link k8s.PodTemplate#getSpec <em>Spec</em>}</li>
 * </ul>
 *
 * @see k8s.K8sPackage#getPodTemplate()
 * @model
 * @generated
 */
public interface PodTemplate extends EObject {
	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' reference.
	 * @see #setMetadata(Metadata)
	 * @see k8s.K8sPackage#getPodTemplate_Metadata()
	 * @model required="true"
	 * @generated
	 */
	Metadata getMetadata();

	/**
	 * Sets the value of the '{@link k8s.PodTemplate#getMetadata <em>Metadata</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(Metadata value);

	/**
	 * Returns the value of the '<em><b>Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec</em>' reference.
	 * @see #setSpec(PodSpec)
	 * @see k8s.K8sPackage#getPodTemplate_Spec()
	 * @model required="true"
	 * @generated
	 */
	PodSpec getSpec();

	/**
	 * Sets the value of the '{@link k8s.PodTemplate#getSpec <em>Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec</em>' reference.
	 * @see #getSpec()
	 * @generated
	 */
	void setSpec(PodSpec value);

} // PodTemplate
